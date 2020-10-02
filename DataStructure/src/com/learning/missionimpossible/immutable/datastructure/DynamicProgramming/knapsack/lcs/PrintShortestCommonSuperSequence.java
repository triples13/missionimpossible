package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

public class PrintShortestCommonSuperSequence {

    public static void main(String [] args){

        String s1 ="eke";
        String s2 = "geek";

        printShortestCommonSuperSequence(s1,s2);

    }

    public static void printShortestCommonSuperSequence(String s1,String s2){

        int [][] dp = new int [s1.length()+1] [s2.length()+1];

        int m= s1.length();
        int n = s2.length();

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){

                if(i==0 || j==0)
                    dp[i][j] =0;
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j] =1+dp[i-1][j-1];
                else
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        StringBuilder sb = new StringBuilder();

        int j=s2.length();

        int i=s1.length();

        for(;i>0 && j>0;i--){

            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else{

                if(dp[i][j-1]>dp[i-1][j])
                {
                    sb.append(s2.charAt(j-1));
                    j--;
                }
                else
                {
                    sb.append(s1.charAt(i-1));
                     i--;
                }
            }
        }

        while(i>0)
        {
            sb.append(s1.charAt(i-1));
            i--;
        }
        while(j>0)
        {
            sb.append(s2.charAt(j-1));
            j--;
        }

        System.out.println("shortest common supersequence:"+sb.reverse().toString());
    }
}
