package com.learning.missionimpossible.immutable.datastructure.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        String a= "hello";
        String b = new String (a);

        System.out.println(a==b) ;

        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();

        int [] arr = new int [len];
        for(int i=0;i<len;i++)
            arr[i] = scn.nextInt();


        findMaxProfit(arr);

    }

    public static void findMaxProfit(int [] arr){

        int [] profit = new int [arr.length];




        int max =0;
        for(int i=0;i<profit.length;i++){

            profit[i] = arr[i];

            for(int j=i-1;j>=0;j--){
                if(arr[i]%arr[j]==0)
                {
                    profit[i] = profit[i]+profit[j];
                    break;
                }
            }
            max = Math.max(max,profit[i]);
        }

        System.out.println(max);

    }
}


