package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack;

public class WaysToDecode {

    public static void main(String [] args){

        System.out.println("total ways:"+totalWaysDecoding("1234",4));
    }


    public static int totalWaysDecoding(String A, int n){

        // we build a recusion tree around n-1 and n-2 , n-1 can be single element which is greater than 0
        // n-2 will be in the range pof 2 to 6
        if(A.charAt(0)=='0')
            return 0;

        if(n==0 || n==1)
            return 1;

        int count =0;

        if(A.charAt(n-1)>'0')
            count = totalWaysDecoding(A,n-1);

        if (A.charAt(n-2) == '1' || A.charAt(n-2) == '2' && A.charAt(n-1) < '7')
            count = count + totalWaysDecoding(A,n-2);

        return count;

    }
}
