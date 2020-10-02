package com.learning.recursion;

import java.util.Arrays;
import java.util.Scanner;


public class solution {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int noOfTestCases=scn.nextInt();
        int i=0;
        while(i<noOfTestCases){
            int files=scn.nextInt();
            int speed=scn.nextInt();
            int []arr=new int [files];
            for(int j=0;j<arr.length;j++){
                 arr[j]=scn.nextInt();
            }
            System.out.println(calculateTime(arr,files,speed));
        }
    }



    private static int calculateTime(int[] arr, int files, int speed) {

        Arrays.sort(arr);
        int totaltime=0 ;
        int initaltime=0;
        for(int i=0;i<arr.length;i++) {

                int intialSpeed = speed / files;
                if(arr[i]<intialSpeed){
                    initaltime=1;
                }
                else {
                    initaltime = (int) Math.ceil((double) arr[i] / intialSpeed);

                }
            System.out.println("time:"+i+initaltime);
                totaltime = totaltime + initaltime;
                for (int j = i + 1; j < arr.length; j++) {
                    arr[j] = arr[j] - (initaltime * intialSpeed);

                }
                files--;

            }

        return totaltime;
    }


}
