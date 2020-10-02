package com.learning.missionimpossible.immutable.datastructure.array.binarysearch;

public class DutchNationalFlag {

    public static void main(String [] args){

        int [] arr = {2,0,0,1,2,1,0};
        solveDutchProblem(arr);
    }
    public static  void solveDutchProblem(int [] arr){

        /*

         all elements less than equal to low should be 0 and all elements greater than equal to high
         should be 2 , so in between we will get 1

         we will take one more pointer which we will move from 0 to high, i will be pivot element at high

         all elements before pivot should be less than 2 , all elements after pivot should be greater than 2

         */

        int low =0;
        int high = arr.length-1;

        int mid = 0;

        while(mid<=high){

            if(arr[mid]==0){
                swapA(arr,mid,low);
                mid++;
                low++;
            }
            else if (arr[mid]==1)
                mid++;
            else
            {
                swapA(arr,mid,high);
                high--;
            }
        }


        for(int x:arr)
            System.out.println(x);
    }

    public static void swapA(int [] arr, int low,int high){

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
