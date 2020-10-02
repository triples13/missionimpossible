package com.learning.missionimpossible.immutable.java8.comparator.stream.optional;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample {

    public static void main(String [] args){

       List<School> listOfSchool = SchoolDatabase.getAllStudent();

       Optional<School> schoolOptional = listOfSchool.stream().filter((school)->{
           return school.getGrade()>8;
       }).collect(Collectors.maxBy(Comparator.comparing(school -> {
           return school.getGrade();
       })));

       if(schoolOptional.isPresent())
       {
           System.out.println("maximum marks student:"+schoolOptional.get());
       }

        listOfSchool.stream().filter((school -> {
            return school.getGrade()>5;
        })).collect(Collectors.toList());

    }
}
