package com.learning.missionimpossible.immutable.Threads.SimpleThreads.semaphore;

import com.learning.missionimpossible.immutable.Threads.SimpleThreads.locking.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class TestingThreads {

    public static void main(String [] args){

        List<Student>  studentList = new ArrayList<>();

        Semaphore semaphore = new Semaphore(4);

        Runnable runnable = ()->{

            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println( "thread:"+Thread.currentThread().getName());
            for(Student student:studentList){

                System.out.println("student name:"+student.getStudentName());
            }

            semaphore.release();
        };


        ExecutorService executorService = Executors.newFixedThreadPool(4);

        executorService.submit(runnable);

        executorService.shutdown();



    }
}
