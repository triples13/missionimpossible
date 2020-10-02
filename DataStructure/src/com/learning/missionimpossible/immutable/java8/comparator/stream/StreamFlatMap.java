package com.learning.missionimpossible.immutable.java8.comparator.stream;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap {

    public static void main(String [] args){

        List<School> schoolList = SchoolDatabase.getAllStudent();

      Long uniqueActivities =  schoolList.stream().map(School::getListOfActivities).
                flatMap(List::stream)
        .distinct().count();
        System.out.println("activities:"+uniqueActivities);

        schoolList.stream().map(School::getListOfActivities).
                flatMap(List::stream)
                .distinct().sorted().forEach((s)->{
            System.out.println(s);
        });
        System.out.println("activities:"+uniqueActivities);
    }
}
