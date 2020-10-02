package com.learning.recursion;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class ListNode {
    private int data;
    private ListNode next;
    private ListNode head;

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;

    }

    public void setData(int data) {
        this.data = data;
    }


    public void add(int data) {

        ListNode temp;
        if (head == null) {
            ListNode node = new ListNode();
            node.setData(data);
            head = node;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode();
            temp.next.setData(data);
            temp.next.next = null;
        }
    }

    public void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.println("next element" + temp.getData());
            temp = temp.next;
        }

    }

    public void remove(int data) {

        ListNode temp = head;


        if (temp.data == data) {
            head = temp.next;

        } else {
            while (temp.next.data != data && temp.next != null) {

                temp = temp.next;
            }

            if (temp.next == null) {
                System.out.println("the element: " + data + "is not present in the list");

            } else if (temp.next.data == data && temp.next.next == null) {
                temp.next = null;
            } else {
                temp.next = temp.next.next;
            }
        }


    }

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public void mergelist(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode p = head;


        System.out.println("hey first list" + l1);
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.data < l2.data) {
                    p.next = l1;
                    l1 = l1.next;


                } else {
                    p.next = l2;
                    l2 = l2.next;

                }
                p = p.next;
            } else if (l1 == null) {
                p.next = l2;
                break;
            } else if (l2 == null) {
                System.out.println("hello" + p);
                p.next = l1;
                break;
            }
        }


        ListNode temp = head.next;
        System.out.println("head" + temp);

        while (temp != null) {
            System.out.println("elements in merged list :" + temp.data);
            temp = temp.next;

        }


    }

    public void insertAtBegining(int data) {
        ListNode temp = head;
        ListNode node = new ListNode();

        node.next = temp;
        node.data = data;
        head = node;

    }

    public void insertAtMiddle(int data) {
        ListNode slowptr = head;
        ListNode fastptr = head;

        while (fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
        }
        System.out.println("slowptr value" + slowptr.data);
        ListNode node = new ListNode();
        node.data = data;
        node.next = slowptr.next;
        slowptr.next = node;


    }

    //program to reverse a linked list

    public ListNode reverseLinkedList(ListNode head) {

        ListNode prev = null;
        ListNode nextnode;
        ListNode current = head;

        while (current != null) {
            nextnode = current.next;
            current.next = prev;
            prev = current;
            current = nextnode;

        }

        return prev;
    }

    //program to remove duplicate nodes from linked list
    public void removeDuplicate(ListNode head) {

        ListNode temp = head;

        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }


        ListNode itr = head;
        while (itr != null) {
            System.out.println("data is :" + itr.data);
            itr = itr.next;
        }
    }

    //program to add 1 to linkedlist
    public void addOneLinkedList(ListNode head) {

        ListNode ptr = reverseLinkedList(head);
        int carry = 1;
        int sum;
        ListNode revresenode = ptr;
        while (ptr != null) {
            sum = carry + ptr.data;
            carry = (sum >= 10) ? 1 : 0;
            ptr.data = sum % 10;
            ptr = ptr.next;
        }
        head = reverseLinkedList(revresenode);
        printsum(head);
    }
    //prints the  sum

    public void printsum(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    //reverse a linkedlist in a group
    public void reverseListGroup(ListNode head, int k) {

        ListNode prev = null;
        ListNode current = head;
        ListNode nextnode;
        int counter = 0;

        while (current != null) {
            if (counter == k) {
                break;
            }
            nextnode = current.next;
            current.next = prev;
            prev = current;
            current = nextnode;
            counter++;

        }

        head.next = current;
        head = prev;

        ListNode temp = head;
        while (temp != null) {
            System.out.println("element" + temp.data);
            temp = temp.next;
        }
    }

    //create cycle
    public ListNode createCycle(ListNode head) {
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;
        return head;
    }

    //detect loop
    public boolean detectLoop(ListNode head) {

        ListNode fastptr = head;
        ListNode slowptr = head;
        boolean loopdetected = false;
        while (slowptr != null && fastptr != null && fastptr.next != null) {

            slowptr = slowptr.next;
            fastptr = fastptr.next.next;

            if (slowptr == fastptr) {
                loopdetected = true;

                break;
            }
        }
        return loopdetected;
    }

    //remove loop from linkedlist
    public boolean removeLoop(ListNode node) {

        ListNode fastptr = node;
        ListNode slowptr = node;


        while (slowptr != null && fastptr != null && fastptr.next != null) {
            if (fastptr.next == slowptr) {
                fastptr.next = null;

                break;
            }
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }


        return detectLoop(node);
    }

    //public boolean detectpalindrome

    //nth node from end
    public void nthNodefromEnd(ListNode head, int n) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode temp = head;
        int count = 1;
        while (temp != null) {
            map.put(count, temp);
            temp = temp.next;
            count++;
        }

        ListNode foundNode = map.get(count - n + 1);
        System.out.println("found node is" + foundNode.data);
        System.out.println("map size " + map.size());
//display elements recursively
    }

    public void displayelements(ListNode head) {

        if (head == null) {
            return;
        }
        displayelements(head.next);
        System.out.println("data is" + head.data);
    }

    //reverse elements in pair
    public void reverseElementsInpair(ListNode head) {

        ListNode currentNode = head;

        ListNode temp = head;

        while (currentNode != null && currentNode.next != null) {

            temp.data = currentNode.data;
            currentNode.data = currentNode.next.data;
            currentNode.next.data = temp.data;
            currentNode = currentNode.next.next;
        }
        ListNode itr = head;
        while (itr != null) {
            System.out.println("data is" + itr.data);
            itr = itr.next;
        }
    }
    //find modular node in linked list

    public void findModular(ListNode head, int n, int k) {
        int count = 1;
        ListNode lastNode=null;
        ListNode temp=head;

        while (count < n && temp!=null) {

            if(count%k==0 && count+k>n){
                lastNode=temp;
                break;
            }
            System.out.println("temp value"+temp);
            temp=temp.next;
            count++;
        }

        System.out.println("last node is"+lastNode.data);
    }
    //find starting node in modular node

    public void findstartNodeinmodular (ListNode head,int n,int k){

        ListNode ptr1=head;
        ListNode ptr2=head;

        int count=1;
        for(int i=0;i<k-1;i++){
            ptr1=ptr1.next;
        }

        ListNode temp=ptr1;

        while (count < n && temp!=null) {

            if(count%k==0 && count+k>n){
                ptr1=temp;
                break;
            }

            temp=temp.next;
           ptr2=ptr2.next;
            count++;
        }
        System.out.println("first node of modular node"+ptr2.data);
    }

    // modular node using for each loop


    public void findModularNodeFor(ListNode head,int n,int k){

        ListNode temp=head;
        ListNode modularNode=null;
        for(int i=1;temp!=null;temp=temp.next){

            if(i%k==0){
                modularNode=temp;
            }
            i++;
        }

        System.out.println("modular node data is:"+modularNode.data);
    }

    //rotate list by k elements
    public void rotateList(ListNode head,int k){
        int length=findLength(head);
        ListNode ptr1=head;
        for(int i=0;i<length-k-1;i++){
            ptr1=ptr1.next;
        }

        ListNode ptr2=ptr1.next;
        ptr1.next=null;
       ListNode newhead=ptr2;
        while(ptr2.next!=null){
            ptr2=ptr2.next;
        }
        ptr2.next=head;

        ListNode temp=newhead;
        for(;temp!=null;temp=temp.next){
            System.out.println("new node"+temp.data);
        }
    }

    //find Length of linked list

    public int findLength(ListNode head){

        ListNode temp=head;
        int counter=1;
        while(temp.next!=null){
            temp=temp.next;
            counter++;
        }
        return counter;
    }
}

