package com.learning.missionimpossible.immutable.java8.comparator.predicate;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateConsumerTest {

    public static void main(String [] args){

        Predicate<Integer> testMarks = (marks)->{
          return marks>50?true:false;
        };

        Predicate<Integer> testGrade = (grade)->{
            return grade>7?true:false;
        };

        BiPredicate<Integer,Integer> testGradeAndMarks = (marks, grade)->{

            return  marks>30 && grade>6 ? true:false;
        };

        BiConsumer<String, List<String>> printNameAndActivities = (name,activities)->{
            System.out.println("name:"+name+":"+"activities:"+activities);

        };

        List<School> listOfSchool = SchoolDatabase.getAllStudent();
        listOfSchool.stream().filter(school -> {
            return testMarks.test(school.getMarks());
        }).forEach(school -> {
            printNameAndActivities.accept(school.getName(),school.getListOfActivities());
        });



        listOfSchool.stream().filter(school -> {
            return testGradeAndMarks.test(school.getMarks(),school.getGrade());
        }).forEach(school -> {
            printNameAndActivities.accept(school.getName(),school.getListOfActivities());
        });
    }
}
