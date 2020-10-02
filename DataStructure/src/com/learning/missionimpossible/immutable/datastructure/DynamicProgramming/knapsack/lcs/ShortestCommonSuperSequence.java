package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

import static com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs.LongestCommonSubSequenceDp.findLongestCommonSubsequenceDp;

public class ShortestCommonSuperSequence {

    public static void  main (String [] args){

        String str1="geek";
        String str2="eke";

        //shortest subsequence would be geeke
        // str1+str2-lcs
        // we have to find lcs
        int lengthOfLongest = findLongestCommonSubsequenceDp(str1,str2);

        System.out.println("lcs length:"+lengthOfLongest);

        int lengthOfLongestSuper = str1.length()+str2.length()-lengthOfLongest;

        System.out.println("length of longest:"+lengthOfLongestSuper);
    }


}
