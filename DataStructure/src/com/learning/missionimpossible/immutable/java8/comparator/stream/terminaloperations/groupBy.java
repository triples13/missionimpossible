package com.learning.missionimpossible.immutable.java8.comparator.stream.terminaloperations;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class groupBy {

    public static void main(String [] args){

        List<School> schoolList = SchoolDatabase.getAllStudent();
       groupByGender(schoolList);
       groupByGrade(schoolList);
       groupByGradeLevel(schoolList);
       groupByGradeCategory(schoolList);
    }

    public static void groupByGender(List<School> schoolList){

        Map<String,Long> groupingByGender =  schoolList.stream().
                collect(Collectors.groupingBy(School::getGender,Collectors.counting()));

        System.out.println("group by gender:"+groupingByGender);
    }

    public static void groupByGrade(List<School> schoolList){

        Map<Integer,List<String>> groupingByGrade =  schoolList.stream().
                collect(Collectors.groupingBy(School::getGrade,Collectors.mapping(School::getName,Collectors.toList())));

        System.out.println("group by grade:"+groupingByGrade);
    }

    public static void groupByGradeLevel(List<School> schoolList){

        // sort on group based on grade level
       Map<Integer, School>  schoolList1 = schoolList.stream().collect(Collectors.groupingBy(School::getGrade,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(School::getGrade)),Optional::get)));

        System.out.println("group on grade and then sort on each group:"+schoolList1);
    }

    public static void groupByGradeCategory(List<School> schoolList){
        Map<String,List<School>> schoolDb = schoolList.stream().collect(Collectors.
                groupingBy((school)->{
                    return school.getGrade()>7 ?"outstanding":"average";
                }));

        System.out.println("school db grouping by grade category"+schoolDb);
    }
}
