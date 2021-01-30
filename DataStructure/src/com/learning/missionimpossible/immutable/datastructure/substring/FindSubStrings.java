package com.learning.missionimpossible.immutable.datastructure.substring;

import java.math.BigInteger;

public class FindSubStrings {

    public static void main(String [] args){

        String inp = "abc";
        String op ="";

        solve(inp,op);
    }

    public static void solve(String inp,String op){

        if(inp.length()==0) {
            System.out.println("substring:" + op);
            return;
        }


            String op2 = op + inp.charAt(0);

            inp = inp.substring(1);

            solve(inp, op);
            solve(inp, op2);



        }



}
