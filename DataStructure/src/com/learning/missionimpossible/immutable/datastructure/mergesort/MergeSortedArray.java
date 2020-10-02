package com.learning.missionimpossible.immutable.datastructure.mergesort;

public class MergeSortedArray {

    public static void main(String [] args){

        int [] arr = {34,45,56,12,1,2,19,16};

        mergeTempArray(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    public static void mergeTempArray(int [] arr, int start,int end){

        if(start<0 || end <0 )
            return;

        if(end>start) {
            int mid = start+(end - start) / 2;

            mergeTempArray(arr, start, mid);
            mergeTempArray(arr, mid + 1, end);

            mergeSortedArray(arr, start, mid, mid + 1, end);
        }
    }

    public static void mergeSortedArray(int [] arr, int start1, int end1, int start2, int end2){



        int [] leftArray = new int [end1-start1+1];

        int [] rightArray = new int [end2-start2];

        for(int i=0;i<leftArray.length;i++)
            leftArray[i] = arr[start1+i];

        for(int j=0;j<rightArray.length;j++)
            rightArray[j] = arr[start2+j];

        int i=0;
        int j=0;

        int temp =start1;

        while(i<leftArray.length && j<rightArray.length){

              if(leftArray[i]<=rightArray[j]){
                  arr[temp] =leftArray[i];
                  i++;
              }
              else{
                  arr[temp] = rightArray[j];
                  j++;
              }

              temp++;
        }



            while(j<rightArray.length){
                arr[temp]=rightArray[j];
                j++;
                temp++;
            }

            while(i<leftArray.length){
                arr[temp] = leftArray[i];
                i++;
                temp++;
            }

    }
}
