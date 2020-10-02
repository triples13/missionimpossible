package com.learning.recursion;

public class StackArray {
    int size;
    int []stack;
    int top=-1;

    StackArray(int size){
        stack=new int[size];
    }
    public int capacity(){
        return (top+1);
    }
    public boolean isEmpty(){
        boolean empty=false;
        if(top==-1)
        {
            empty=true;
        }
        return  empty;
    }
    public void push(int element) throws  Exception{

        if(capacity()==size){
            throw  new Exception("stack is full");
        }
        stack[++top]=element;
    }
    public int pop() throws  Exception{
        if(isEmpty()){
            throw  new Exception("stack is empty");
        }
        int popedelement=stack[top];
        top--;
        return  popedelement;
    }
}
