package com.learning.missionimpossible.immutable.serializable;

import java.io.*;

public class serializetest {

    public static void main(String [] args) throws IOException, ClassNotFoundException {

        School school = new School();
        school.setAddress("patna");
        school.setId("1");
        school.setName("maxwell");
        FileOutputStream fileOutputStream = new FileOutputStream("hello.text");
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

        oos.writeObject(school);


        FileInputStream fileInputStream = new FileInputStream("hello.text");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        School school1 = (School) objectInputStream.readObject();

        System.out.println("school name"+school.getName());
        System.out.println("school address"+school.getAddress());
    }
}
