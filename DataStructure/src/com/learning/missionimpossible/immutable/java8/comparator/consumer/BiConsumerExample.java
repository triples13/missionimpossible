package com.learning.missionimpossible.immutable.java8.comparator.consumer;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String [] args){

        BiConsumer<Integer,Integer> biConsumerPrint = (a,b)->{
            System.out.println("a:"+a+"b:"+b);
        };

        BiConsumer<Integer,Integer> multiplyConsumer =(a,b)->{
            System.out.println("a:"+a*2+"b:"+b*2);
        };
        BiConsumer<Integer,Integer> divideCosumer = (a,b)->{
            System.out.println("a:"+a/3+"b:"+b/3);
        };

        multiplyConsumer.andThen(divideCosumer).andThen(biConsumerPrint).accept(7,6);

      /*  BiConsumer<String, List<String>> printNameAndActivities = (name,activites)->{

            System.out.println("name:"+name+":"+"activities:"+activites);
        };

        List<School> listOfSchool = SchoolDatabase.getAllStudent();
        listOfSchool.forEach(school -> {
            printNameAndActivities.accept(school.getName(),school.getListOfActivities());
        });*/


    }
}
