package com.learning.missionimpossible.immutable.Threads.SimpleThreads.locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Student {

    private int studentId;
    private String studentName;
    private String studentRollNo;

    ReentrantLock l = new ReentrantLock(true);


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(String studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public void incrementNumber(){



        try {
            System.out.println("threads waiting:"+l.getQueueLength());
            if (l.tryLock(5, TimeUnit.MILLISECONDS)) {

                if(l.tryLock()){
                    System.out.println("hold count:"+l.getHoldCount());
                }
                System.out.println("lock acquired by thread:"+Thread.currentThread().getName());
                for (int i = 0; i < 100; i++) {
                    System.out.println("i:" + i);
                }

            }
            else
                System.out.println("couldnot got lock exiting");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(l.isHeldByCurrentThread())
            l.unlock();
            if(l.isHeldByCurrentThread())
            l.unlock();
            System.out.println("hold count:"+l.getHoldCount());
        }

    }
}
