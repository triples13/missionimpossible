package com.learning.Singleton;

public class TestLazySingleton {

    public static void main(String []args){
        LazySingleton lazy=LazySingleton.getSingleton();
        LazySingleton lazy1=LazySingleton.getSingleton();

        if(lazy==lazy1){
            System.out.println("hey only one instance is created");
        }
    }
}
