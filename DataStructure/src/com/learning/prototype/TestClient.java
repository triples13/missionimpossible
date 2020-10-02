package com.learning.prototype;

public class TestClient {

    public  static void main(String []args)
    {
        Dog d=new Dog();
        Dog d2=(Dog)AnimalFactory.getAnimalFactory(d);
        System.out.println("dog:"+d2.i);
    }
}
