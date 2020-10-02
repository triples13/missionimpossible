package com.learning.missionimpossible.immutable.java8.comparator.predicate;

import java.util.function.Predicate;

public class predicateExample {

    public static void main(String [] args){

        Predicate<String> p1 = (s1)->{
            return s1.length()<5;
        };

        Predicate<String> p2 =(s1)->{
            return s1.length()<20;
        };


        Predicate p3 = p1.and(p2);

        System.out.println("test:" +p3.test("hello"));


    }
}
