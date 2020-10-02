package com.learning.prototype;

public class Sheep implements Animal,Cloneable {

    Sheep s;
    public Sheep makeCopy(){
        try {
            s= (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return s;
    }
}
