package com.learning.missionimpossible.immutable.Threads.SimpleThreads.locking;

public class LockingCheck {

    public static void main(String [] args) throws InterruptedException {

        Student student = new Student();
        student.setStudentId(12);
        student.setStudentName("raemsh");
        student.setStudentRollNo("678");

        Thread thread1 = new Thread(()->{

            synchronized (student){
                student.setStudentId(student.getStudentId()+1);
            }
        });

        Thread thread2 = new Thread(()->{
            synchronized (student){
                student.setStudentId(student.getStudentId()+1);
            }
        });

        Thread thread3 = new Thread(()->{
            synchronized (student){
                student.setStudentId(student.getStudentId()+1);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();


        Thread.sleep(1000);


    }
}
