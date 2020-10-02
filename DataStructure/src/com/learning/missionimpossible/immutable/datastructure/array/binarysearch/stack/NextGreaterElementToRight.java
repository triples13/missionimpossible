package com.learning.missionimpossible.immutable.datastructure.array.binarysearch.stack;

import java.util.LinkedList;
import java.util.Stack;

public class NextGreaterElementToRight {

    public static void main(String [] args){

        int [] arr = {1,3,2,4};

        printNextGreaterElement(arr);
    }

    public static  void printNextGreaterElement(int [] arr){

        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);

        for(int i=1;i<arr.length;i++){

            while(!stack.isEmpty() && arr[i]>stack.peek())
            {
                System.out.println("next greater element of "+stack.peek()+":"+arr[i]);
                stack.pop();
            }

            stack.push(arr[i]);
        }

        while(!stack.isEmpty())
            System.out.println("next greater element of "+stack.pop()+":"+-1);
    }
}
