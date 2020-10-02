package com.learning.recursion;

import java.util.*;
import java.util.stream.Collectors;

public class SortElementByFrequency {

    public static void main(String []args){
         int []arr={2,2,1,1,0,1,4,4,1,0};

         sortElementFrequency(arr);
    }

    private static void sortElementFrequency(int[] arr) {

        Map<Integer,Integer> hmap=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hmap.get(arr[i])==null){
                hmap.put(arr[i],1);
            }
            else{
                int frequency=hmap.get(arr[i]);
                hmap.put(arr[i],frequency+1);

            }
        }

        int count=0;
Set<Map.Entry<Integer,Integer>> entrySet=hmap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).
        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new)).entrySet();

for(Map.Entry<Integer,Integer> entry:entrySet){
    System.out.println(entry.getValue());
    int val=entry.getValue();
    for(int i=0;i<val;i++){
        arr[count]=entry.getKey();
        count++;
    }

}
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}


    }
}
