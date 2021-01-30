package com.learning.testinterview;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {

    //string str= pwwkew;

    public static void main(String [] args){


        findLongestSubstring("pwwkew");

    }

    public static int findLongestSubstring(String str){


          Map<Character,Integer> hmap = new HashMap<>();




          int startWindow = 0;

          int lastWindow =0;
          int longestString =Integer.MIN_VALUE;
          for(;lastWindow<str.length();lastWindow++){

              char ch = str.charAt(lastWindow);


              if(hmap.containsKey(ch))
              {
                  longestString = Math.max(longestString,lastWindow-startWindow-1);
                  int frequency = str.charAt(startWindow);
                  if(frequency>1)
                      hmap.put(str.charAt(startWindow),frequency-1);
                  else
                      hmap.remove(str.charAt(startWindow));

                  startWindow++;

              }





          }
          return  longestString;

    }




}
