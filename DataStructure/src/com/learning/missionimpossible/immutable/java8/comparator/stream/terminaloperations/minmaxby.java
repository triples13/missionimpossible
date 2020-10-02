package com.learning.missionimpossible.immutable.java8.comparator.stream.terminaloperations;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class minmaxby {

    public static  void main(String [] args){

        List<School>  schoolList = SchoolDatabase.getAllStudent();

        Optional<School> maxMarks = schoolList.stream().collect(Collectors.maxBy(Comparator.comparing(School::getGrade)));
        Optional<School> minMarks = schoolList.stream().collect(Collectors.minBy(Comparator.comparing(School::getMarks)));


        System.out.println("max marks student:"+maxMarks.get());
        System.out.println("min marks student:"+minMarks.get());
    }
}
