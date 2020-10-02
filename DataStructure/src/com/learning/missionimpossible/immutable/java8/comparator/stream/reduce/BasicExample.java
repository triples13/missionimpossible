package com.learning.missionimpossible.immutable.java8.comparator.stream.reduce;

import java.util.Arrays;
import java.util.List;

public class BasicExample {

    public static void main(String [] args){


        List<Integer> integerList = Arrays.asList(1,2,3,4,5,8,9);

        int summation =integerList.stream().reduce(1,(a,b)->{
            return a+b;
        });

        int multiplication = integerList.stream().reduce(1,(a,b)->{
            return a*b;
        });
        int highestNo = integerList.stream().reduce(1,(a,b)->{
            return a>b?a:b;
        });

        System.out.println("summation:"+summation);
        System.out.println("multiplication:"+multiplication);
        System.out.println("highestno:"+highestNo);
    }
}
