package com.learning.missionimpossible.immutable.failfastfailsafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapTest {

    public static void main(String [] args) {

        Map<String, Integer> hashMap = new ConcurrentHashMap<>();



        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put(null, 6);
        hashMap.put(null, 8);

        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
           // hashMap.put("c", 3);
        }

        System.out.println("get value"+hashMap.get(null));

    }


    }

