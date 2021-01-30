package com.learning.missionimpossible.immutable.datastructure.recursion;

public class MinimumEditDistance {

    public static void main(String [] args){
         String s1 = "abcd";
         String s2 = "abc";

        System.out.println("minimum distance:"+ minimumEditDistance(s1,s2,s1.length(),s2.length()));
    }

    public static int minimumEditDistance(String s1,String s2,int m,int n){

        if(m ==0 )
            return n;
        if(n==0)
            return m;

        if(s1.charAt(m-1)==s2.charAt(n-1))
            return minimumEditDistance(s1,s2,m-1,n-1);
        else {
            return Math.min(1 + minimumEditDistance(s1, s2, m, n - 1), Math.min(1 + minimumEditDistance(s1, s2, m - 1, n),
                    1 + minimumEditDistance(s1, s2, m - 1, n - 1)));
        }

    }
}
