package com.learning.missionimpossible.immutable.datastructure.array.binarysearch.stack;

import java.util.Arrays;
import java.util.Stack;

public class MaximumAreaInHistogram {

    public static void main(String [] args){

        int [] arr = {6,2,5,4,5,1,6};

        int [] right = findNextSmallestToRight(arr);
        int [] left = findNextSmallestToLeft(arr);

        int area = Integer.MIN_VALUE;

        for(int i=0;i<right.length;i++){
            int totalArea = arr[i]*(right[i]-left[i]-1);
            area = Math.max(area,totalArea);
        }

        System.out.println("maxm area:"+area);
    }

    public static int [] findNextSmallestToRight(int [] arr){

        Stack<Integer> stack = new Stack<>();
        int [] rightArray = new int [arr.length];

        rightArray[arr.length-1] =-1;

        Arrays.fill(rightArray,arr.length);

        for(int i=0;i<arr.length-1;i++){

            while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
                rightArray[stack.pop()] = i;



            stack.push(i);
        }

        return rightArray;

    }

    public static int [] findNextSmallestToLeft(int [] arr){

        int [] leftArray = new int [arr.length];

        Arrays.fill(leftArray,-1);
        Stack<Integer> stack = new Stack<>();


        for(int i=arr.length-1;i>0;i--){

            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]) {
                leftArray[stack.pop()] = i;
            }
            stack.push(i);
        }

        return leftArray;
    }
}
