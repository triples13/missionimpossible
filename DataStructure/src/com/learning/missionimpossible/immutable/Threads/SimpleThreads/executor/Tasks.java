package com.learning.missionimpossible.immutable.Threads.SimpleThreads.executor;

import java.util.concurrent.Callable;

public class Tasks implements Callable<String> {

    private String clientId;


    Tasks(String clientId){
        this.clientId = clientId;
    }

    @Override
    public String call() throws Exception {
        return this.clientId;
    }
}
