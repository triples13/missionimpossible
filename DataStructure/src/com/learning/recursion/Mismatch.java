package com.learning.recursion;

public class Mismatch {

    public static void main(String [] args){

        printAllString("aataaanac");
    }

    public static void printAllString(String s){

        int maxmMistach = Integer.MIN_VALUE;

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){

                String originalString = s.substring(i,j);
                String reverseString = reverse(originalString);

                maxmMistach = Math.max(getMismatch(originalString,reverseString),maxmMistach);
            }
        }

        System.out.println("maxm mismatch:"+maxmMistach);
    }

    public static int getMismatch(String originalString, String reverseString){

        int count =0;
        for(int i=0;i<originalString.length();i++){
            if(originalString.charAt(i)!=reverseString.charAt(i))
                count++;
        }

        return count;
    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
