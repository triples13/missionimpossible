package com.learning.missionimpossible.immutable.Threads.SimpleThreads.deadlock;

import com.learning.missionimpossible.immutable.Threads.SimpleThreads.locking.Student;

public class TestDeadLock {

    public static  void main(String [] args){

        Student student1 = new Student();
        student1.setStudentId(123);
        student1.setStudentRollNo("1234");
        student1.setStudentName("ramesh");

        Student student2 = new Student();
        student2.setStudentName("suresh");
        student2.setStudentRollNo("344");
        student2.setStudentId(23344);


        Thread t1 = new Thread(()->{

            System.out.println(Thread.currentThread().getName()+" trying to get lock on student 1 object");
            synchronized (student1) {

                System.out.println(Thread.currentThread().getName() + "got lock on student 1 object");


                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "trying to get lock on student 2 object");
                synchronized (student2) {
                    System.out.println(Thread.currentThread().getName() + "got lock on student 2 object");
                }
            }
        });

        Thread t2 = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"trying to get lock on student 2 object");
            synchronized (student2) {

                System.out.println(Thread.currentThread().getName() + "got lock on student 2 object");


                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "trying to get lock on student 1 object");
                synchronized (student1) {
                    System.out.println(Thread.currentThread().getName() + "got lock on student 1 object");
                }
            }
        });

        t1.setName("first thread");
        t2.setName("second thread");

        t1.start();
        t2.start();
    }
}
