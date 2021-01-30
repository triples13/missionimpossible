package com.learning;

import java.util.*;

public class Testing {

    // anagram
    //list of strings
    //o/p list of lists each sublist contains all string which are anagram of each other

    // i-> eat,ate,tea,study,edit,now,won,diet,god,dog
    //[[eat,ate,tea],[won,now],[god,dog][]]

    public static void main(String [] args){

        List<String> myList = Arrays.asList("eat","ate","tea","study","edit","now","won");

        List<List<String>> result =   findAllPossibleAnagrams(myList);

        System.out.println(result);
    }

    public static List<List<String>>   findAllPossibleAnagrams(List<String> anagramList){

        List<List<String>> finalResult = new ArrayList<>();

        Map<String,List<String>> hmap = new HashMap<>();



        for(int i=0;i<anagramList.size();i++) {

            String toSort = anagramList.get(i);
            char [] store = toSort.toCharArray();
            Arrays.sort(store);

            String temp = new String(store);
            hmap.put(temp,new ArrayList<>());

        }

             for(int j=0;j<anagramList.size();j++){

                 String temp =  anagramList.get(j);
                   String var = anagramList.get(j);

                   char[] hel = var.toCharArray();

                   Arrays.sort(hel);

                   String x = new String(hel);
                   if(hmap.containsKey(x)){
                       List<String> tempList   = hmap.get(x);
                       tempList.add( temp);
                       hmap.put(x,tempList);
                   }
             }

        System.out.println("hmp:"+hmap);

            for(Map.Entry<String,List<String>> entry:hmap.entrySet()){
                finalResult.add(entry.getValue());
            }

        return finalResult;
    }
}
