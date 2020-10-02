package com.learning.prototype;

public class AnimalFactory {

    public static  Animal getAnimalFactory(Animal animal){
        return animal.makeCopy();
    }
}
