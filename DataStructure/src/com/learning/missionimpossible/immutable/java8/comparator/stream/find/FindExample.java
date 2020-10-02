package com.learning.missionimpossible.immutable.java8.comparator.stream.find;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindExample {

    public static void main(String [] args){

        List<School> schoolList = SchoolDatabase.getAllStudent();


       Optional<School> school= schoolList.stream().findFirst();
        System.out.println("present:"+school.get());

       Optional<School> school1 = schoolList.stream().filter((School)->{
            return  School.getGrade()>3;
        }).findAny();

        System.out.println("any school:"+school1.get());
    }
}
