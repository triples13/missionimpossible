package com.learning.testinterview;

public class TotalWaysDecoding {

    public static void main(String [] args){

        findTotalWays("1234");
    }

    public static void findTotalWays(String toFind){

        int [] dp = new int [toFind.length()];

        dp[0]=1;
        dp[1] =1;
        for(int i=2;i<dp.length;i++){

            if(toFind.charAt(i)>'0')
                dp[i]=1+dp[i-1];
            else if(toFind.charAt(i-1)=='1' ||toFind.charAt(i-1)=='2' && toFind.charAt(i)>'9')
                dp[i]=1+dp[i]+dp[i-2];
            else
                dp[i]=dp[i-1];
        }



        System.out.println("sum:"+dp[dp.length-1]);
    }
}
