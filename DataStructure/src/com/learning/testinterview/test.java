package com.learning.testinterview;

import java.util.HashMap;
import java.util.Map;

public class test {

    /*
      948033** charge 10rs   948033**
      9480** charge 5rs
      9986** charge 6rs

      9456 charge 2rs                    948066

      9->[0,9]->0[0,9]->


      9480333333

      longest match
     */

    public static void main(String [] args){

       int [] arr = {6,7,5,1,6,7,1};
       int  window_size = 4;

       printUniqueElementsInWindow(arr,window_size);
    }

    public static void printUniqueElementsInWindow(int [] arr, int windowSize){

        Map<Integer,Integer> hmap = new HashMap<>();

        int firstWindow=0;
        int lastWindow =0;
        for(;lastWindow<arr.length;lastWindow++ ){

             if(hmap.containsKey(arr[lastWindow]))
                 hmap.put(arr[lastWindow],hmap.getOrDefault(arr[lastWindow],0)+1);

             if(lastWindow-firstWindow+1>=windowSize)
             {
                 System.out.println("unique elements:"+hmap.size());
                 int element = arr[firstWindow];
                 int frequency = hmap.get(element);
                 if(frequency==0)
                     hmap.remove(element);
                 else
                    hmap.put(element,frequency-1);

                 lastWindow++;
             }
        }

    }

}
