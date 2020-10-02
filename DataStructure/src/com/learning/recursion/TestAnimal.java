/*
package com.learning.recursion;

import java.util.*;

public class TestAnimal {

    public static void main(String []args){
        new TestAnimal().go();
    }
    public void go(){
       Animal[] animals={new Dog(),new cat(),new Dog()};
       takeAnimal(animals);
       Dog[] dogs={new Dog(),new Dog()};
       takeAnimal(dogs);
       ArrayList<? extends Animal> arrayList=new ArrayList<Dog>();
     Map<String,String> hmap=new HashMap<>();
     hmap.put("shashank","shekhar");
     hmap.put("madhav","jha");
     hmap.put("mr","attti");

     Set keyset=hmap.entrySet();
     Iterator itr=keyset.iterator();
     while(itr.hasNext()){
         String key=(String) itr.next();
         hmap.get(key);


     }
    }

    public void store(){
        ArrayList<Animal> animals =new ArrayList<>();
        animals.add(new Dog());
        animals.add(new cat());

        takegenericanimal(animals);

        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog());
        takegenericanimal(dogs);
    }

    public void takegenericanimal(ArrayList<? extends Animal> arrayAnimal){

        Iterator<Animal> itr=arrayAnimal.iterator();
        arrayAnimal.add(new Dog());
        while(itr.hasNext()){
            Animal a =(Animal)itr;
            System.out.println("ddsfs:"+a.toString());
        }
    }
    public void takeAnimal(Animal []animals){
        animals[0].eat();
        animals[0]=new cat();
    }
}
*/
