package com.learning.missionimpossible.immutable.datastructure.array.binarysearch;

public class countelementoccurance {

    public static void main(String [] args){

        int arr[] = {-5,-3,0,1,3,3,3,4,5};

        int s = 3;

     int firstOccurance = findFirstOccurance(arr,s);
    int lastOccurance =  findLastOccurance(arr,s);

        System.out.println("firt:"+firstOccurance);
        System.out.println("last:"+lastOccurance);

    int totaloccurance = lastOccurance-firstOccurance+1;
        System.out.println("total frequency:"+ totaloccurance);

    }

    public static int findLastOccurance(int [] arr, int s){

        int low =0;
        int high = arr.length-1;
        while(low<=high){

            int mid = (low+high)/2;

            // check for last occurance
            if(arr[mid]==s &&(mid==arr.length-1 || arr[mid+1]!=s))
                return mid;

            //ex = {1,4,5,5,5,6,7} go right and search
            else if(s>=arr[mid])
                low=mid+1;
            else
                high=mid-1;

        }

        return -1;
    }



    public static int findFirstOccurance(int []arr, int s){


        int low =0;
        int high = arr.length-1;
        while(low<=high){

            int mid = (low+high)/2;

            if(arr[mid]==s &&(mid==0 || arr[mid-1]!=s))
                return mid;

            // go left and search
            else if(s<=arr[mid])
                high=mid-1;
            else
                low=mid+1;

        }

        return -1;
    }
}
