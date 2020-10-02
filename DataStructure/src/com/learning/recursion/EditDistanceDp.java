package com.learning.recursion;

import java.util.HashSet;

public class EditDistanceDp {

    public static void main(String [] args){

        String word1 = "cat";
        String word2 = "cut";

        System.out.println("min steps:"+ computeMinDp(word1,word2));

    }
    public static int computeMinDp(String word1,String word2){

        System.out.println("inside dp");
        int [] [] dp = new int [word2.length()+1][word1.length()+1];


        for(int i=0;i<=word2.length();i++){
            for(int j=0;j<=word1.length();j++)

                if(i==0)
                    dp[i][j] = j;
                else if (j==0)
                    dp[i][j] =i;
                else if(word2.charAt(i-1)==word1.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = 1+Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));

        }

        return dp[word2.length()][word1.length()];
    }
}
