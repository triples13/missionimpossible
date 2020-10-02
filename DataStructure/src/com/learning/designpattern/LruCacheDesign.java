package com.learning.designpattern;

public class LruCacheDesign {

    public static void main(String [] args){

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(5);

        doubleLinkedList.addEntry(2,3);
        doubleLinkedList.addEntry(1,4);

        System.out.println("value:"+doubleLinkedList.getNode(2));

       doubleLinkedList.addEntry(5,6);

        System.out.println("value:"+doubleLinkedList.getNode(5));

        System.out.println("first:"+doubleLinkedList.head.next.val);

    }
}
