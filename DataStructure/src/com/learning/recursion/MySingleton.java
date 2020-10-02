package com.learning.recursion;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MySingleton implements Serializable {

    private  static   MySingleton singletonVariable=null;
    private MySingleton(){

    }

    public Object readResolve(){
        return singletonVariable;
    }

    public static MySingleton getSingleton(){

        if(singletonVariable==null){
            synchronized (MySingleton.class){
                if(singletonVariable==null){
                    singletonVariable=new MySingleton();
                }
            }
        }

        return singletonVariable;
    }

    public static void main(String[]args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz=Class.forName("com.learning.recursion.MySingleton");
        Constructor<?> constructor=clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
       Object obj= constructor.newInstance();
        System.out.println("singleton"+obj.hashCode());

    }
}
