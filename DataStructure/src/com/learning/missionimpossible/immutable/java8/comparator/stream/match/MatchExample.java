package com.learning.missionimpossible.immutable.java8.comparator.stream.match;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.List;

public class MatchExample {

    public static void main(String [] args){


        List<School> schoolList = SchoolDatabase.getAllStudent();


        boolean anyStudentGradeGreaterThan6 = schoolList.stream().anyMatch((School)->School.getGrade()>6);
        System.out.println("grade greater than 6:"+anyStudentGradeGreaterThan6);
        boolean allStudentGreaterThan10 = schoolList.stream().allMatch(school -> school.getGrade()>10);
        System.out.println("grade greater than 10:"+allStudentGreaterThan10);
        boolean nonStudentLessThan3 =schoolList.stream().allMatch(school -> school.getGrade()<4);
        System.out.println("grade less than 5:"+nonStudentLessThan3);
    }
}
