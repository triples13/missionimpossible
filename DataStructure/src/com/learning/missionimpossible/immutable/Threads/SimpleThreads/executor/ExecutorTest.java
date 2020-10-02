package com.learning.missionimpossible.immutable.Threads.SimpleThreads.executor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class ExecutorTest {

    public static void main(String [] args) throws ExecutionException, InterruptedException {

        ExecutorService  executor = Executors.newFixedThreadPool(3);

      /*  Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"abc");
        hashMap.put(2,"cde");
        hashMap.put(3,"efg");

        List<Future<String>>  futureList = new ArrayList<>();

        for(Map.Entry<Integer,String> entry: hashMap.entrySet()){

           Future<String>  future =executor.submit(new Tasks(entry.getValue()));
           futureList.add(future);
        }

        System.out.println("doing some other work");


        for(Future<String> future: futureList){
            if(future.isDone())
                System.out.println("future return"+future.get());
        }
        executor.shutdown();*/


      List<Callable<String>> callableList = new ArrayList<>();

      callableList.add(()->{

          return "hello";
      });
      callableList.add(()->{
          return "hey";
      });
      callableList.add(()->{
          return "welcome";
      });


     List<Future<String>>  futureList = executor.invokeAll(callableList);

        for(Future<String> future: futureList){
            if(future.isDone())
                System.out.println("future return"+future.get());
        }


        executor.invokeAny(callableList);
        executor.shutdown();

    }
}
