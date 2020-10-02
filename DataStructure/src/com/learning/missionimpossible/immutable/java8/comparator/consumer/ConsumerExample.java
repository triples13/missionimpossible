package com.learning.missionimpossible.immutable.java8.comparator.consumer;

import com.learning.missionimpossible.immutable.java8.comparator.Person;

import java.util.function.Consumer;

public class ConsumerExample {

    public static  void main(String [] args){

        Consumer<Person> printLastName = person -> {
            System.out.println(person.getLastName());
        };

        Consumer<Person> printAge = person -> {
            System.out.println(person.getAge());
        };

        Consumer<Person> printFirstName = person -> {
            System.out.println(person.getFirstName());
        };

        Person p = new Person();
        p.setAge(23);
        p.setLastName("sinha");
        p.setFirstName("ramesh");

       Consumer<Person> consumer3  = printAge.andThen(printFirstName).andThen(printLastName);
       consumer3.accept(p);
    }
}
