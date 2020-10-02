package com.learning.recursion;

public  class Animal {

    void eat(){
        System.out.println("animal eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog bark");
    }
}

class cat extends  Animal{
    void meow(){
        System.out.println("cat meow");
    }
}
