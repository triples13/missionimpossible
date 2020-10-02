package com.learning.missionimpossible.immutable.java8.comparator;

import java.util.Arrays;
import java.util.List;

public class SchoolDatabase {

    public static List<School> getAllStudent(){

        List<String> activitiesList = Arrays.asList("swimming","running","playing");
        School s1 = new School("ramesh",9,"male",93,activitiesList);



        School s2= new School("mahesh",7,"male",73,activitiesList);

        School s3 = new School("sweetie",6,"female",63,activitiesList);


        School s4 = new School("pinky",5,"female",53,activitiesList);
        School s5 = new School("sushant",5,"female",51,activitiesList);
        School s6 = new School("shahsank",9,"male",93,activitiesList);
        School s7 = new School("ashish",7,"male",73,activitiesList);



        List<School> schoolList = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);

        return schoolList;
    }
}
