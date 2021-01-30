package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

public class WaysToDecodeDp {

    public static  void main(String [] args){

        System.out.println("total:"+totalWaysToDecode("1234"));
    }

    public static int totalWaysToDecode(String s){

        if(s.charAt(0)=='0')
            return 0;

        int [] dp = new int [s.length()];

        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<s.length();i++){

            int count=0;
            if(s.charAt(i-1)>'0')
                count = dp[i-1];

            if (s.charAt(i-2) == '1' ||  s.charAt(i-2) == '2' && s.charAt(i-1) < '7')
                count = count + dp[i-2];

            dp[i]=count;
        }

        return dp[s.length()-1];
    }
}
