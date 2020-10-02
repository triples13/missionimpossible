package com.learning.recursion;

public class LinkedListImplementationStack {
    int data;
    LinkedListImplementationStack next;
    LinkedListImplementationStack top;
    LinkedListImplementationStack head;
    int length=0 ;

    public boolean isEmpty(){
        boolean empty=false;
        if (top==null){
            empty=true;
        }
        return empty;
    }



    public void push (int data){

        if(head==null){
            LinkedListImplementationStack newnode=new LinkedListImplementationStack();
            newnode.data=data;
            newnode.next=null;
            head=newnode;
            top=head;
        }
        else{
            LinkedListImplementationStack temp=head;
            while(temp.next!=null){
               temp=temp.next;
            }
            temp=new LinkedListImplementationStack();
            temp.data=data;
            temp.next=null;


        }

        length++;

    }

    public int peek() throws  Exception{

        LinkedListImplementationStack temp=head;

        if(isEmpty()){
            throw  new Exception("stack is empty");
        }
        head=temp.next;
        temp.next=null;
        top=head;

        return temp.data;

    }
}
