package com.learning.recursion;

public class TestStack {

    public static void main(String []args){
        StackOperation stackops=new StackOperation();
        String pattern="((({[]})))";
        boolean checkcompilitation=stackops.isvalidSymbolpattern(pattern);
        System.out.println("check compiliation is:"+checkcompilitation);
    }
}
