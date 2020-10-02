/*
package com.learning.recursion;

import java.util.ComparatorTest;
import java.util.HashMap;
import java.util.Map;

public class Car
{

  public static void main(String []args){
      Map<Integer,String> hmap=new HashMap<>();
      hmap.put(10,"shashank");
      hmap.put(20,"Shekhar");
      hmap.put(70,"Ramesh");
      hmap.put(1,"Anuj");
      hmap.put(3,"Aabhash");

      hmap.entrySet().stream().sorted(ComparatorTest.comparing(Map.Entry::getValue)).forEach(e->{
          e.getValue();
          e.getKey();
      });

    hmap.entrySet().stream().filter(e->{
        e.getValue();
        e.getKey();
    }).forEach();
      hmap.entrySet().stream().sorted(ComparatorTest.comparing(Map.Entry::getKey)).forEach(e->{
          e.getKey();
          e.getValue();
      });
      hmap.remove(new String("A"));
      System.out.println(hmap);
  }
}
*/
