package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

public class InterleavingString {
    public static void main(String [] args){

        String a = "aabcc";
        String b = "dbbcd";
        String c = "aadbbcbcac";

        System.out.println("strings are interleaving:" +findIfInterleaving(a,b,c,a.length(),b.length(),c.length()));

    }

    public static boolean findIfInterleaving(String a,String b,String c, int m,int n, int k){

            if(m==0 && n==0 && k==0)
                 return true;



           // if characters are equal then we traverse in both the strings
            if((m>0 && n>0 && k>0) && a.charAt(m-1)==c.charAt(k-1) && b.charAt(n-1)==c.charAt(k-1) )
            {
                boolean temp = findIfInterleaving(a,b,c,m-1,n,k-1) || findIfInterleaving(a,b,c,m,n-1,k-1);
                return temp;
            }

            // if charactrers are equal in 1st and 3rd string then we traverse in 1st and 3rd
            if(m>0 && k>0 && a.charAt(m-1)==c.charAt(k-1))
                return findIfInterleaving(a,b,c,m-1,n,k-1);

            // if characters are equal in 2nd and 3rd string then we traverse in 2nd and 3rd
            if(n>0 && k>0 && b.charAt(n-1)==c.charAt(k-1))
               return  findIfInterleaving(a,b,c,m,n-1,k-1);


        return false;
    }
}
