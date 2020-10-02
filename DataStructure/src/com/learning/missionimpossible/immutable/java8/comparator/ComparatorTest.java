package com.learning.missionimpossible.immutable.java8.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String [] args){

        String [] stringList = {"ramesh","raju","radha","tom"};


        Comparator<String> comparator = ( s1, s2)->{
            return Integer.compare(s2.length(),s1.length());
        };

        Arrays.sort(stringList,comparator);

        for(String s:stringList)
            System.out.println("string:"+s);
    }
}
