package com.learning.missionimpossible.immutable.customekeys;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class customkeytest
{
    public static void main(String [] args){

        Customer customer1 = new Customer();
        customer1.setId("1");
        customer1.setName("ramesh");
        customer1.setRollNo("123");

        Customer customer2 = new Customer();
        customer2.setId("2");
        customer2.setName("rajesh");
        customer2.setRollNo("456");

        Customer customer3 = new Customer();
        customer3.setId("2");
        customer3.setName("rajesh");
        customer3.setRollNo("456");

        Map<Customer,String> hashmap = new HashMap<>();
        hashmap.put(customer1,"adsdaadds");
        hashmap.put(customer2,"aasawwww");
        hashmap.put(customer3,"gtyuowww");

        System.out.println("hash1"+ customer2.hashCode());
        System.out.println("hash2"+customer3.hashCode());

        System.out.println(hashmap.get(customer3));
        System.out.println(hashmap.get(customer2));
    }
}
