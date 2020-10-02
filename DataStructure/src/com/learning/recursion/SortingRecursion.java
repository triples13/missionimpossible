package com.learning.recursion;

public class SortingRecursion {
    public static  void main(String []args){

        int []arr={23,25,12,2,67,12,4,99,1};
        sort(arr,0,8);
    }

    public static void  sort(int []arr,int start_index,int end_index){
        int min_index;
        int temp;
        if(start_index>=end_index){
            return;
        }
        else{
            min_index=getminimumvalueindex(arr,start_index,end_index);

            temp=arr[min_index];
            arr[min_index]=arr[start_index];
            arr[start_index]=temp;

            sort(arr,start_index+1,end_index);


        }
    }

    public static int getminimumvalueindex(int []arr,int start_index,int end_index){
        int smallestvalue=arr[0];
        int pos=0;
       for(int i=1;i<arr.length;i++){
           if(smallestvalue>arr[i]){
               smallestvalue=arr[i];
               pos=i;
           }
       }
       return pos;
    }

}
