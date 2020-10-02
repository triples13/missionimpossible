package com.learning.designpattern;


import java.util.HashMap;
import java.util.Map;

class Node{
    int val;
    Node next;
    Node prev;
}
public class DoubleLinkedList {

    public Node head;
    public Node end;
    public int size;

    Map<Integer,Node> hmap ;
    DoubleLinkedList(int size){
        hmap= new HashMap<>();
        this.size = size;
        head = new Node();
        end =new Node();
    }

  public void addEntry(int key,int value) {

      if (hmap.containsKey(key)) {

          Node node = hmap.get(key);
          node.val = value;
      } else {

          if (hmap.size() != size) {
              if (head.next == null) {
                  Node node = new Node();
                  head.next = node;
                  node.prev=head;
                  end.prev=node;
                  node.next=end;
                  node.val=value;
                  hmap.put(key, node);
              } else {
                  Node temp = head.next;

                  while (temp.next != end) {
                      temp = temp.next;
                  }
                  Node node = new Node();
                  node.next =end;
                  end.prev=node;
                  temp.next=node;
                  node.prev=temp;
                  node.val=value;

                  hmap.put(key, node);
              }
          } else {
              deleteAtLast();
          }
      }
  }

  public int getNode(int key){

       Node node = hmap.get(key);

       putAtTop(node);

       return node.val;

  }

  public void putAtTop(Node node){

        if(head.next!=node) {
            Node temp = head.next;

            node.prev.next = node.next;
            node.next.prev = node.prev;

            node.next = temp;
            temp.prev = node;
            head.next = node;
            node.prev = head;
        }

  }

      public void deleteAtLast(){

        Node temp = end.prev;
        end.prev.next =null;
        end.prev=null;

        end.prev = temp;
        temp.next=end;



      }
}
