package com.learning.missionimpossible.immutable.java8.comparator.stream.IntStream;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntegerOperations {

    public static void main(String [] args){

        // primitive type
       int sum = IntStream.range(0,49).sum();

        System.out.println("summation:"+sum);

        OptionalDouble average = IntStream.range(0,49).average();

        OptionalInt max = IntStream.rangeClosed(0,49).max();

        System.out.println("average:"+average.getAsDouble());
        System.out.println("max:"+max.getAsInt());

        Long longsum = LongStream.range(1,50).sum();
        System.out.println("longsum:"+sum);

        // boxing

      List<Integer> integerList =IntStream.range(0,49).boxed().collect(Collectors.toList());
        System.out.println("integer list:"+integerList);

        List<School> schoolDatabases = SchoolDatabase.getAllStudent();

        // maptoInt maptoDouble maptoObj are used on int type
        List<String> marksInString = schoolDatabases.stream().
             map(School::getGrade).mapToInt(School->School).mapToObj(School->String.valueOf(School)).collect(Collectors.toList());


        System.out.println("grade of students:"+marksInString);


    }
}
