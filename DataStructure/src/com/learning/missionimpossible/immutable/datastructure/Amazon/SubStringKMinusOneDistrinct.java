package com.learning.missionimpossible.immutable.datastructure.Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubStringKMinusOneDistrinct {


    public static void main(String [] args){

        System.out.println(findAllSubString("awaglk",4));
        System.out.println(findAllSubString("wawaglknagagwunagkwkwagl",4));
        System.out.println(findAllSubString("democracy",5));
    }
/*
 sliding window with map
 */
    public static List<String> findAllSubString(String s,int k){

        int windowStrt =0;
        int windowEnd = 0;

        Map<Character,Integer> hashMap = new HashMap<>();

        List<String> subStringList = new ArrayList<>();

        while(windowEnd<s.length()){

            hashMap.put(s.charAt(windowEnd),hashMap.getOrDefault(s.charAt(windowEnd),0)+1);


            if ( windowEnd-windowStrt==k-1){

                if(hashMap.size()==k-1)
                    subStringList.add(s.substring(windowStrt,windowEnd+1));

                int frequency = hashMap.get(s.charAt(windowStrt));

                if(frequency==1)
                     hashMap.remove(s.charAt(windowStrt));
                else
                    hashMap.put(s.charAt(windowStrt),frequency-1);

                windowStrt++;
            }

            windowEnd++;
        }

        return subStringList;
    }
}
