package com.learning.missionimpossible.immutable.java8.comparator.stream.sort;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class sortFunction {

    public static void main(String []args){


        List<School> schoolList = SchoolDatabase.getAllStudent();

        schoolList.stream().sorted(Comparator.comparing(School::getMarks).thenComparing(School::getGrade)).
                forEach((School)->{
                    System.out.println(School.getName());
                });


       Map<String,Integer> schoolNameGrade = schoolList.stream().
               sorted(Comparator.comparing(School::getGrade)).
               distinct().
               collect(Collectors.toMap(School::getName,School::getGrade));


       schoolNameGrade.entrySet().stream().forEach(stringIntegerEntry ->
       {
           System.out.println("key:"+stringIntegerEntry.getKey());
           System.out.println("value:"+stringIntegerEntry.getValue());
       });
    }
}
