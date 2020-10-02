package com.learning.missionimpossible.immutable.java8.comparator.function;

import com.learning.missionimpossible.immutable.java8.comparator.School;
import com.learning.missionimpossible.immutable.java8.comparator.SchoolDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {

        Function<List<School>, Map<String, Integer>> mapFunction =
                (listOfSchool) -> {
                    Map<String, Integer> hmap = new HashMap<>();
                    listOfSchool.forEach(school -> {
                        hmap.put(school.getName(), school.getMarks());
                    });

                    return hmap;
                };

        Consumer<Map<String,Integer>> printMap = (tmap)->{

            for(Map.Entry<String,Integer> entry:tmap.entrySet()) {
                System.out.println("name:" + entry.getKey()+"marks:"+":"+entry.getValue());
            }
        };

        printMap.accept(mapFunction.apply(SchoolDatabase.getAllStudent()));
    }
}
