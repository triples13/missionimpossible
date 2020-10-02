package com.learning.recursion;

import java.util.HashSet;

public class EditDistance {

    static int min(int x, int y, int z)
    {
        if (x <= y && x <= z)
            return x;
        if (y <= x && y <= z)
            return y;
        else
            return z;
    }

    public static void main(String [] args){

        String w1= "intention";
        String w2 = "execution";

        System.out.println("min steps:"+minimumStepsRequired(w1,w2,9,9));
    }

    public static int minimumStepsRequired(String w1,String w2,int l1,int l2){

        if(l1==0)
            return l2;
        if(l2==0)
            return l1;

        if(w1.charAt(l1-1)==w2.charAt(l2-1))
            return minimumStepsRequired(w1,w2,l1-1,l2-1);


             return 1+min(minimumStepsRequired (w1,w2,l1-1,l2),
                     minimumStepsRequired(w1,w2,l1,l2-1),
                     minimumStepsRequired(w1,w2,l1-1,l2-1));




    }
}
