package com.learning.missionimpossible.immutable.java8.comparator.function;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestBiFunction {

    public static void main(String [] args){

        BiFunction<List<School>, Predicate<School>, Map<String,Integer>>
                compareFunction = (schoolList,predicate)->{

            Map<String,Integer> hashMap = new HashMap<>();
            schoolList.forEach(school -> {
                if(predicate.test(school))
                    hashMap.put(school.getName(),school.getMarks());
            });

            return hashMap;
        };

        Predicate<School> testMarks = (school -> {

            if(school.getMarks()>70 || school.getGrade()>7)
                return  true;
            else
                return false;
        });

        Consumer<Map<String,Integer>> printNameAndMarks = (tmap)->{

            for(Map.Entry<String,Integer> entry:tmap.entrySet()){
                System.out.println("name:"+entry.getKey()+","+"marks:"+entry.getValue());
            }
        };

        printNameAndMarks.accept(compareFunction.apply(SchoolDatabase.getAllStudent(),testMarks));
    }
}
