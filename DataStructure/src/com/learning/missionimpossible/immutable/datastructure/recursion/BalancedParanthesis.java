package com.learning.missionimpossible.immutable.datastructure.recursion;

import java.util.ArrayList;
import java.util.List;

public class BalancedParanthesis {

    private static  List<String> result;
    public static void main(String [] args){

        int n =3;

        result = new ArrayList<>();
        generateParanthesis(n,n,"");

        System.out.println("total:"+result);
    }


    public static void generateParanthesis(int open,int close,String word){


        if(open==0 && close>=0)
        {
            while(close!=0){
                word = word+")";
                close--;
            }
        }

        if(open ==0 && close ==0) {
            result.add(word);
            return;
        }

        if(open<close)
            generateParanthesis(open,close-1,word+")");

        generateParanthesis(open-1,close,word+"(");
    }
}
