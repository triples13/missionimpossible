package com.learning.missionimpossible.immutable.datastructure.array.binarysearch;

public class BiotonicArray {

    public static void main(String [] args){

        int [] arr = {1,3,8,12,4,2};

        System.out.println("find max:"+findMaximumNumberInBiotonicArray(arr));

        int [] arr1 = {3,8,3,1};
        System.out.println("find max:"+findMaximumNumberInBiotonicArray(arr1));

        int [] arr2 = {1,3,8,12};
        System.out.println("find max:"+findMaximumNumberInBiotonicArray(arr2));

        int [] arr3 = {10,9,8};
        System.out.println("find max:"+findMaximumNumberInBiotonicArray(arr3));
    }

    public static int findMaximumNumberInBiotonicArray(int [] arr){

        int low =0;
        int high = arr.length-1;

        int N = arr.length;

        while(low<=high){

            int mid = (low+high)/2;

            int next = (mid+1)%N;
            int prev = (mid-1+N)%N;

            if(arr[mid]>arr[prev] && arr[mid]>arr[next])
                return arr[mid];

            else if (arr[mid]>arr[prev] && arr[mid]<arr[next])
                low = mid+1;
            else if(arr[mid]<arr[prev] && arr[mid]>arr[next])
                high = mid-1;

        }

        return arr[high];
    }
}
