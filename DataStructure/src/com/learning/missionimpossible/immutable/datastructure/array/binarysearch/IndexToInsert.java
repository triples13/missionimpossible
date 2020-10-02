package com.learning.missionimpossible.immutable.datastructure.array.binarysearch;

public class IndexToInsert {

    public static void main(String [] args){

        int [] arr= {1,3,6,8,10};

        int key = 9;

        System.out.println("pos insert:"+posToInsert(arr,9));

    }

    public static int posToInsert(int [] arr, int key){

        int low =0;
        int high = arr.length-1;

        while (low<=high){

            int mid = (low+high)/2;

            if(arr[mid]==key)
                return mid;

            else if(key>arr[mid])
                low = mid+1;
            else
                high = mid-1;
        }

        return  low;
    }
}
