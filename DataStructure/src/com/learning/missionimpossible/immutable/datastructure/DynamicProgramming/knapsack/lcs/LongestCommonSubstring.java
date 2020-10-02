package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

public class LongestCommonSubstring {

   static int count;
    public static  void main(String [] args){
        String s1= "abcdxyz";
        String s2 = "xyzabcd";


        count =Integer.MIN_VALUE;
        findLongestCommonSubString(s1,s2,s1.length(),s2.length(),0);
        System.out.println("longest common substring:"+count);
    }

    public static void findLongestCommonSubString(String s1,String s2,int m,int n,int localCount){

        if(m==0 || n==0)
            return ;


         if (s1.charAt(m-1)==s2.charAt(n-1)) {
             localCount =localCount+1;
             count = Math.max(count, localCount);
            findLongestCommonSubString(s1, s2, m - 1, n -1, localCount);
        }
        else {

             findLongestCommonSubString(s1, s2, m - 1, n, 0);
             findLongestCommonSubString(s1, s2, m, n - 1, 0);
         }


    }
}
