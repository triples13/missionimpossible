package com.learning.missionimpossible.immutable.java8.comparator;

import java.util.List;

public class School {

    private String name;
    private int grade;
    private String gender;
    private int marks;
    private List<String> listOfActivities;

    public School(String name, int grade, String gender, int marks, List<String> listOfActivities) {
        this.name = name;
        this.grade = grade;
        this.gender = gender;
        this.marks = marks;
        this.listOfActivities = listOfActivities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public List<String> getListOfActivities() {
        return listOfActivities;
    }

    public void setListOfActivities(List<String> listOfActivities) {
        this.listOfActivities = listOfActivities;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", gender='" + gender + '\'' +
                ", marks=" + marks +
                ", listOfActivities=" + listOfActivities +
                '}';
    }
}
