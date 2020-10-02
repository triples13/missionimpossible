/*
package com.learning.recursion;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static java.lang.Class.forName;

public class TestObject {

    public static void main(String []args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, CloneNotSupportedException {
        Car c=new Car();
        */
/*
        1st way to create object
         *//*

        System.out.println("car"+c.toString());

          */
/*
    second way to create object
     *//*

          //static method of forname loads .class file from hard disk into RAM
        //returns a class object
     */
/*  Class<?> clazz= forName("com.learning.recursion.Car");
        Object obj=clazz.newInstance();
        Constructor<?> constructor=clazz.getConstructor();
        Object obj1=constructor.newInstance();
        System.out.println("");
*//*


     */
/*   Class<?> clazz1=forName("com.learning.recursion.MySingleton");
        Constructor<?> constructors=clazz1.getConstructor();
        constructors.setAccessible(true);
        Object obj2=constructors.newInstance();
        MySingleton singleton=(MySingleton)obj2 ;
        System.out.println("create instance of singleton");
        System.out.println("hey:"+obj2.toString());*//*


        */
/*
        using serialization
         *//*



        MySingleton singleton1=MySingleton.getSingleton();
        System.out.println("hashcode before deserializing:"+singleton1.hashCode());
        FileOutputStream fis=new FileOutputStream("file.txt");

        ObjectOutputStream oos=new ObjectOutputStream(fis);
        oos.writeObject(singleton1);
        oos.flush();

        FileInputStream fin=new FileInputStream("file.txt");
        ObjectInputStream ooi=new ObjectInputStream(fin);
        //readresolve is called here after object is read from stream
        MySingleton mySingletonnew=(MySingleton) ooi.readObject();
        System.out.println("new object hashcode after deserialing "+mySingletonnew.hashCode());


       // MySingleton singleton3=(MySingleton) singleton1.clone();
      //  System.out.println("singleton object creation in java:"+singleton3.hashCode());
    }



}
*/
