package com.learning.missionimpossible.immutable.datastructure.sliding;

import java.util.HashMap;
import java.util.Map;

public class permutationpresent {

    public static void main(String [] args){

        String first = "oidbcaf";
        String pattern = "abc";

        System.out.println("checking permutation is present:"+ checkIfPermutationPresent(first,pattern));
    }

    public static  boolean checkIfPermutationPresent(String current,String patternToFind){

        Map<Character,Integer> hashMap = new HashMap<>();

        for(char ch:patternToFind.toCharArray())
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);

        int matched =0;
        int windowStart=0;
        for(int windowEnd =0;windowEnd<current.length();windowEnd++){

            if(hashMap.containsKey(current.charAt(windowEnd))){

                char lastCharacter = current.charAt(windowEnd);

                hashMap.put(lastCharacter,hashMap.get(lastCharacter)-1);

                if(hashMap.get(lastCharacter)==0)
                    matched++;
            }

            if(matched==patternToFind.length())
                return true;

            if(windowEnd-windowStart+1>patternToFind.length()){

                char last = current.charAt(windowStart);

                if(hashMap.containsKey(last)){
                    if(hashMap.get(last)==0)
                         matched--;

                    hashMap.put(last,hashMap.get(last)+1);
                }
                windowStart++;
            }

        }

        return false;
    }
}
