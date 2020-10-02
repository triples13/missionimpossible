package com.learning.missionimpossible.immutable.java8.comparator.stream.terminaloperations;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class joining {

    public static void main(String [] args){

        List<School> schoolList = SchoolDatabase.getAllStudent();

       String nameList = schoolList.stream().map(School::getName).collect(Collectors.joining("_"));
        System.out.println("nameList:"+nameList);
        String nameS = schoolList.stream().map(School::getName).collect(Collectors.joining("_","(",")"));
        System.out.println("names:"+nameS);
    }
}
