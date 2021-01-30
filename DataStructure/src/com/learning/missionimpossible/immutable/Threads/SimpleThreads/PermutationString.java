package com.learning.missionimpossible.immutable.Threads.SimpleThreads;

public class PermutationString {
    public static void main(String [] args){
        String p ="abcd";

        findAllPerumte(p,0,p.length());
    }

    public static void findAllPerumte(String p,int start,int end)
    {
        if(start==end-1)
        {
            System.out.println( p);
        }

       else {
            for (int i = start; i < end; i++) {
                 p=swap(p, start, i);
                findAllPerumte(p, start + 1, end);
                p=swap(p, start, i);
            }
        }
    }

    public static String swap(String a,int i,int j){

        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }
}
