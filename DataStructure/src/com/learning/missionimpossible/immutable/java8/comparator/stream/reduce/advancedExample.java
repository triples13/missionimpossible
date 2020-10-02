package com.learning.missionimpossible.immutable.java8.comparator.stream.reduce;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.List;
import java.util.Optional;

public class advancedExample {

    public static void main(String [] args){

        List<School> schoolList = SchoolDatabase.getAllStudent();

        Optional<Integer> totalMarks = schoolList.stream().
                map(School::getMarks).reduce((school1, school2) -> {
                return school1+school2;});

        System.out.println("total marks of all students:"+totalMarks.get());

        Optional<Integer> marksOfStudentGreaterThan90 = schoolList.stream().
                filter(school -> {
                   return school.getGrade()>5;
                }).map(School::getMarks).reduce((school, school2) -> {
                    return  school+school2;
                });

        System.out.println("marks greater than 90:"+marksOfStudentGreaterThan90.get());


        Optional<Integer> highestMarks = schoolList.stream().
                map(School::getMarks).reduce((school1,school2)->{
                    return school1>school2?school1:school2;
        });

        System.out.println("highest marks:"+highestMarks.get());

    }
}
