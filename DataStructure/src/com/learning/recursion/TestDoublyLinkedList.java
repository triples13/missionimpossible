package com.learning.recursion;

public class TestDoublyLinkedList {

    public static void main(String []args){
       DoubleListNode doubleLinkedList=new DoubleListNode();

        doubleLinkedList.insert(29);
        doubleLinkedList.insert(31);
        doubleLinkedList.insert(22);
        doubleLinkedList.insert(27);

       // doubleLinkedList.print();

      //  doubleLinkedList.remove(31);
        doubleLinkedList.insertAtBegining(29);
        doubleLinkedList.insertAtMiddle(9);
      doubleLinkedList.print();
    }

}
