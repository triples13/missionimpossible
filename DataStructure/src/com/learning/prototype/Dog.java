package com.learning.prototype;

public class Dog implements  Animal,Cloneable{
    Dog d;

    int i=20;
    @Override
    public Animal makeCopy() {
        try {
            d=(Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return  d;
    }
}
