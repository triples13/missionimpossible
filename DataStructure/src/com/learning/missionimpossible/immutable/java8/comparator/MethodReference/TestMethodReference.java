package com.learning.missionimpossible.immutable.java8.comparator.MethodReference;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.function.Predicate;

public class TestMethodReference {

    public static void main(String [] args){



        Predicate<School> testGrades = TestMethodReference::TestGrades;

        SchoolDatabase.getAllStudent().forEach(school -> {

            if(testGrades.test(school))
                System.out.println(school.getName());
        });
    }

    public static boolean TestGrades(School s){

       return s.getGrade()>7?true:false;
    }


}
