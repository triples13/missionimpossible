package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

public class LongestSubStringDp {

    public static void main(String [] args){

        String str1= "abcdxyz";
        String str2= "xyzabcd";

        System.out.println("longest common substring :"+findLongestCommonSubStringDp(str1,str2));

    }

    public static int findLongestCommonSubStringDp(String s1,String s2){

        int [][] dp = new int [s1.length()+1][s2.length()+1];

        int m = s1.length();
        int n = s2.length();

        int max= Integer.MIN_VALUE;

        for(int i=0;i<=m;i++){

            for(int j=0;j<=n;j++){

                if(i==0 || j==0)
                    dp[i][j]=0;
                else if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    max = Math.max(max, 1 + dp[i - 1][j - 1]);
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else
                    dp[i][j]=0;
            }
        }

        return max;
    }
}
