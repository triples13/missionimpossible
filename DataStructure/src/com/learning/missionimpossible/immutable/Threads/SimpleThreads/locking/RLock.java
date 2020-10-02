package com.learning.missionimpossible.immutable.Threads.SimpleThreads.locking;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class RLock {

    public static void main(String [] args) throws InterruptedException {


        ReentrantLock l = new ReentrantLock();

        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setStudentRollNo("123");
        s1.setStudentName("ramesh");

        Student s2 = new Student();
        s2.setStudentName("suresh");
        s2.setStudentId(2);
        s2.setStudentRollNo("456");

        Map<String, Student> hashMap = new HashMap<>();
        hashMap.put("first",s1);
        hashMap.put("second",s2);


        Thread t1 = new Thread(()->{

            s1.incrementNumber();
        });

        Thread t2 = new Thread(()->{
            s1.incrementNumber();
        });

        Thread t3 = new Thread(()->{
            s1.incrementNumber();
        });
        Thread t4 = new Thread(()->{
            s1.incrementNumber();
        });

        Thread t5 = new Thread(()->{
            s1.incrementNumber();
        });

        t1.setName("first");
        t2.setName("second");
        t3.setName("third");
        t4.setName("fourth");
        t5.setName("fifth");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
