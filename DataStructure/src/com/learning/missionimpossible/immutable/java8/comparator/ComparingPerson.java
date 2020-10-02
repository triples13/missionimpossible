package com.learning.missionimpossible.immutable.java8.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingPerson {

    public static void main(String [] args) {

        Person person1 = new Person();
        person1.setAge(27);
        person1.setFirstName("shashank");
        person1.setLastName("sinha");

        Person person2 = new Person();
        person2.setAge(21);
        person2.setFirstName("ramesh");
        person2.setLastName("powar");

        Person person3 = new Person();
        person3.setAge(21);
        person3.setFirstName("yude");
        person3.setLastName("sinha");

        List<Person> personList = Arrays.asList(person1, person2, person3);


        Comparator.comparing(Person::getAge).thenComparing(Person::getFirstName).
                thenComparing(Person::getLastName);

        Collections.sort(personList, Comparator.comparing(Person::getAge).thenComparing(Person::getFirstName).reversed().
                thenComparing(Person::getLastName));

        personList.stream().forEach(person -> {
            System.out.println(person.getAge());
            System.out.println(person.getFirstName());
            System.out.println(person.getLastName());

        });
    }
}
