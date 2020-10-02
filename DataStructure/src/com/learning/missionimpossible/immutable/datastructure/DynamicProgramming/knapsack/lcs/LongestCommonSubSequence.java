package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

public class LongestCommonSubSequence {

    public static void main(String [] args){

        // lcs length will be from 0 to min(s1.length(),s2.length())

        String s1= "ABCDGH";
        String s2 = "AEDFHR";

        System.out.println("longest common subsequence:"+findLongestCommonSub(s1,s2,s1.length(),s2.length()));
    }

    public static int findLongestCommonSub(String str1, String str2, int m, int n){

        if(m==0 || n==0)
            return 0;

        else if(str1.charAt(m-1)==str2.charAt(n-1))
            return 1+findLongestCommonSub(str1,str2,m-1,n-1);

        else {
            return Math.max(findLongestCommonSub(str1,str2,m-1,n),
            findLongestCommonSub(str1,str2,m,n-1));

        }
    }
}
