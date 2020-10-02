package com.learning.missionimpossible.immutable.Threads.SimpleThreads.callable;

import java.util.concurrent.*;

public class CallableExample {

    public static void main(String [] args) throws ExecutionException, InterruptedException {


        final int val =2;

        Callable<Integer> callable = ()->{
            return val*2;
        };
        ExecutorService service =  Executors.newSingleThreadExecutor();

        Future<Integer> futureTask = service.submit(callable);
        System.out.println("hello i am waiting for future");
        System.out.println("let me get future:"+futureTask.get());

        

        service.shutdown();
    }
}
