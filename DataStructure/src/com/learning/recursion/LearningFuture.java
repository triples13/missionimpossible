package com.learning.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class processor implements Callable<String>{

    public String call(){

        return "hello world";
    }

}
public class LearningFuture {

    public static void main(String []args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<Future<String>> arraylist = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Future future = executorService.submit(new processor());
            arraylist.add(future);
        }
        for (Future<String> future : arraylist) {
            System.out.println(future.get());
        }


    }
}
