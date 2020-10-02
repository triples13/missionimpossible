package com.learning.missionimpossible.immutable.java8.comparator.stream.terminaloperations;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class mapping {

    public static void main(String [] args){

        List<School> schoolList = SchoolDatabase.getAllStudent();

        List<String> nameList = schoolList.stream().collect(Collectors.mapping(School::getName,Collectors.toList()));

        System.out.println("name of string:"+nameList);

        String nameOfStudent = schoolList.stream().collect(Collectors.mapping(School::getName,Collectors.joining("_")));

        System.out.println("nameofstudent:"+nameOfStudent);
    }
}
