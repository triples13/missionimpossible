package com.learning.missionimpossible.immutable.datastructure.array.binarysearch.stack;

import java.util.Stack;

public class NextGreaterToLeft {

    public static void main(String [] args){

        int [] arr ={1,3,2,4};

        nextGreaterToLeft(arr);
    }

    public static void nextGreaterToLeft(int [] arr){

        Stack<Integer> stack = new Stack<>();

        stack.push(arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i--){

            while(!stack.isEmpty() && arr[i]>stack.peek())
            {
                System.out.println("next greater to left of:"+stack.peek()+":"+arr[i]);
                stack.pop();
            }
            stack.push(arr[i]);
        }

        while(!stack.isEmpty())
            System.out.println("next greater element of "+stack.pop()+":"+-1);
    }
}
