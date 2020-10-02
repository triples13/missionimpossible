package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

import static com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs.LongestCommonSubSequenceDp.findLongestCommonSubsequenceDp;

public class LongestPalindromicSubSequence {

    public static  void main(String [] args){

        String str1= "agbcba";

        // longest palindromic subsequence is also a lcs question
        // if we reverse the string and find lcs between original
        //string and reversed string

        StringBuilder sb = new StringBuilder(str1);

        int length = findLongestCommonSubsequenceDp(str1,sb.reverse().toString());

        System.out.println("longest common palindromic subsequence:"+length);
    }
}
