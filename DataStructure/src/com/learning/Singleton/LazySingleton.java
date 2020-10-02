package com.learning.Singleton;

public class LazySingleton {

    private LazySingleton(){

    }

    private static volatile LazySingleton identity;

    public static LazySingleton getSingleton(){
        if(identity==null)
        {
            synchronized (LazySingleton.class) {
                if (identity == null) {
                    identity = new LazySingleton();
                }
            }
        }
        return identity;
    }
}

