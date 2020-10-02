package com.learning.recursion;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestArrayWithThreeStack {
    public static void main(String []args) throws Exception{
        ArrayWiththreeStack treeStack=new ArrayWiththreeStack(9);
        treeStack.push(1,32);
        treeStack.push(1,43);
        treeStack.push(2,23);
        treeStack.push(3,19);
        treeStack.push(1,12);
        treeStack.push(1,16);
        treeStack.push(3,5);
        treeStack.push(1,89);
        treeStack.push(2,2);
        treeStack.push(3,29);
        treeStack.push(1,67);
        treeStack.push(3,101);




        System.out.println("data is:"+treeStack.pop(1));

    }
}
