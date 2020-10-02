package com.learning.missionimpossible.immutable.java8.comparator.supplier;

import com.learning.missionimpossible.immutable.java8.comparator.Person;

import java.util.function.Supplier;

public class supplierExample {

    public static void main(String [] args){

        Supplier<Person>  supplier = ()-> new Person();

       Person p = supplier.get();

    }
}
