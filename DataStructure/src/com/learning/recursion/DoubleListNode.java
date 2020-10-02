package com.learning.recursion;

public class DoubleListNode {

    private int data;
    private DoubleListNode next;
    private DoubleListNode prev;
    private DoubleListNode head;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleListNode getNext() {
        return next;
    }

    public void setNext(DoubleListNode next) {
        this.next = next;
    }

    public DoubleListNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleListNode prev) {
        this.prev = prev;
    }




    public void insert(int data){

        if(head==null){

        DoubleListNode node=new DoubleListNode();
        head=node;
        node.next=null;
        node.data=data;
        node.prev=null;

        }
        else {
            DoubleListNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            DoubleListNode node = new DoubleListNode();
            temp.next = node;
            node.prev = temp;
            node.data = data;
            node.next = null;
        }

    }

    public void print(){

        DoubleListNode temp=head;

        while(temp!=null){
            System.out.println("element is:"+temp.data);
            temp=temp.next;
            }
    }

    public void remove(int data){


        DoubleListNode temp=head;


            while( temp!=null && temp.data!=data){
                temp=temp.next;
            }

            if(temp==head)
            {
                head=temp.next;
                temp.next.prev=null;
            }
            else if(temp==null){
                System.out.println("element not found");

            }
            else if(temp.next==null && temp.data==data && temp!=null){
                temp.prev.next=null;
                temp.prev=null;
            }
            else{
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
                temp.next=null;
                temp.prev=null;
            }
        }

        public void insertAtBegining(int data){

        DoubleListNode temp=head;
        DoubleListNode node=new DoubleListNode();
        node.data=data;
        node.next=temp;
        temp.prev=node;
        node.prev=null;
        head=node;
        }

        public void insertAtMiddle(int data){

        DoubleListNode fastptr=head;
        DoubleListNode slowptr=head;

        while(fastptr.next!=null && fastptr!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
        }

        DoubleListNode node=new DoubleListNode();

        node.data=data;
        node.next=slowptr.next;
        node.prev=slowptr.next.prev;
        slowptr.next=node;
        }

}
