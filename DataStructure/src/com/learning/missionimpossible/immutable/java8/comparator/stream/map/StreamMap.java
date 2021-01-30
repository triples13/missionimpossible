package com.learning.missionimpossible.immutable.java8.comparator.stream.map;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String [] args){


        List<School> schoolList = SchoolDatabase.getAllStudent();



       List<String>  schoolList1 = schoolList.stream().map((school -> {
           return school.getName();
       })).map(String::toUpperCase).collect(Collectors.toList());

       schoolList1.forEach((School)->{
           System.out.println("school :"+School);
       });
    }
}
