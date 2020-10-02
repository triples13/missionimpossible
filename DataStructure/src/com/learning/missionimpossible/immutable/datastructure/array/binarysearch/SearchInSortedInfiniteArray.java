package com.learning.missionimpossible.immutable.datastructure.array.binarysearch;


class ArrayReader{
    int[] arr;

    ArrayReader(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        if (index >= arr.length)
            return Integer.MAX_VALUE;
        return arr[index];
    }
}
public class SearchInSortedInfiniteArray {

    public static  void main(String [] args) {
        ArrayReader reader = new ArrayReader(new int[]{4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30});
        System.out.println(SearchInSortedInfiniteArray.search(reader, 16));
        System.out.println(SearchInSortedInfiniteArray.search(reader, 11));
        reader = new ArrayReader(new int[]{1, 3, 8, 10, 15});
        System.out.println(SearchInSortedInfiniteArray.search(reader, 15));
        System.out.println(SearchInSortedInfiniteArray.search(reader, 200));
    }

    public static int search(ArrayReader reader,int val){

        int low =0;
        int high = 1;

        int prevLow =0;

        while(reader.get(high)<val){

            low = high+1;
            high = 2*(high-prevLow+1)+high;

            prevLow =low;
        }

      return  searchInBinaryArray(reader,low,high,val);
    }

    public static int searchInBinaryArray(ArrayReader reader,int low,int high,int key){


        while(low<=high){

            int mid = (low+high)/2;

            if(reader.get(mid)==key)
                return mid;

            else if (reader.get(mid)>key)
                high = mid-1;
            else
                low = mid+1;

        }

        return  -1;
    }
}
