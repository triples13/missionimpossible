package com.learning.missionimpossible.immutable.java8.comparator.stream.partitionBy;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class partitionExample {

    public static void main(String [] args){

        List<School> schoolList = SchoolDatabase.getAllStudent();

        Predicate<School> schoolPredicate = (School)->{
            return School.getGrade()>8;
        };

        Map<Boolean,List<School>> booleanListMap =schoolList.stream().collect(Collectors.partitioningBy(schoolPredicate));

        System.out.println("boolean map:"+booleanListMap);

        // convert to set

        Map<Boolean, Set<School>> setOfSchools = schoolList.stream().collect(Collectors.partitioningBy(schoolPredicate,Collectors.toSet()));

        System.out.println("set of schools:"+setOfSchools);
    }
}
