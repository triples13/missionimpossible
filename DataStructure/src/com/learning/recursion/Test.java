package com.learning.recursion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Test{
    static String s="hello";
    public static void main(String []args){

  s="ram";
  Test t=new Test();
  int returnvalue=t.check();
        System.out.println("return value"+returnvalue);
        System.out.println(t.s);
        ArrayList a=new ArrayList();
        ArrayList b=new ArrayList();
        a.add(2);
        a.add(3);
        b=(ArrayList) a.clone();
        b.add(4);
        b.remove(4);
        System.out.println("hey"+a.equals(b));

        Test t1=new Test();
        Test t2=new Test();
        List l=new ArrayList();
        l.add(t1);
        l.add(t2);
        Collections.sort(l);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }

    int check(){
        try{
            System.out.println("try block'");
             throw new IOException();

        }
        catch (Exception e){
            System.out.println("catch");
          return 2;
        }
        finally {
            System.out.println("finally");
            return 3;
        }
    }
}