package com.learning.missionimpossible.immutable.java8.comparator.stream.limit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class limitexample {

    public static void main(String [] args){


        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

      Optional<Integer> sum = integerList.stream().skip(3).reduce((one, two)->{
            return one+two;
        });

      Optional<Integer> limitNo = integerList.stream().limit(3).reduce((one,two)->{
          return one*two;
      });

        System.out.println("multiplication:"+limitNo.get());
        System.out.println("sum after skipping three no:"+sum.get());
    }
}
