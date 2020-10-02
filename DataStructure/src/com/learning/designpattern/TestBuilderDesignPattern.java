package com.learning.designpattern;

public class TestBuilderDesignPattern {

    public static void main(String []args){
        Phone p=new Phone.PhoneBuilder()
                .setMemory("6gb")
                .buildphone();
        p.getMemory();
    }
}
