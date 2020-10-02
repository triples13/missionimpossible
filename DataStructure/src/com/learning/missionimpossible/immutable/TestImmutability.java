package com.learning.missionimpossible.immutable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestImmutability {

    public static void main(String [] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Address address = new Address();
        address.setCity("bangalore");
        address.setCountry("india");
        address.setState("karnatka");
        Student s = new Student(1,23,"shashank",address);

        System.out.println("before immutability");
        System.out.println("student name:"+s.getName());
        System.out.println("city:"+s.getAddress().getCity());
        System.out.println("changing immutability");
        s.getAddress().setState("tamilnadu");
        s.getAddress().setCity("chennai");
        System.out.println("changed state:"+s.getAddress().getState());
        System.out.println("changed city:"+s.getAddress().getCity());


        ///
    }
}
