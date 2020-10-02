package com.learning.missionimpossible.immutable.java8.comparator.stream;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

    public static void main(String [] args){


        List<School> schoolList = SchoolDatabase.getAllStudent();

        Map<String,List<String>> studentMap =
                schoolList.stream().collect(Collectors.toMap(School::getName,School::getListOfActivities));
        System.out.println("map:"+studentMap);

        schoolList.stream().peek(School->{
            System.out.println("1st filter:"+School.toString());
        }).filter(school -> school.getGrade()>7).
                peek((School)->{
                    System.out.println("2nd filter:"+School.toString());
                }).
                forEach((school -> {
                    System.out.println(school.toString());
                }));


    }
}


