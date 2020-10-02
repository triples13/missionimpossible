package com.learning.missionimpossible.immutable.objectcreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestObjectCreation {

    public static void main(String [] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {


        // 1st way
        Address address = (Address) Class.forName("Address.class").newInstance();
        System.out.println("1st object:"+address);

        // 2nd ways
         Constructor<Address> addressConstructor =  Address.class.getDeclaredConstructor();
         Address address1 =  addressConstructor.newInstance();
        System.out.println("2nd object:"+address1);

        //3rd way
        Address address2 = new Address();
        System.out.println("3rd object:"+address2);

        // 4th way

        Address address3 = (Address) address2.clone();
        System.out.println("4th object:"+address3);



    }
}
