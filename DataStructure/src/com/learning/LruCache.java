package com.learning;

import java.util.HashMap;
import java.util.Map;

class node{

    int val;
    node next;
    node prev;
}
public class LruCache {

    Map<Integer, node> hmap;
    node root;
    int size;

    LruCache(int size) {
        hmap = new HashMap<>();
        size = 5;
    }

    public void add(int key, int value) {

        if (hmap.size() < size) {
            if (!hmap.containsKey(key)) {

                node n = new node();
                n.val = value;
                n.next = root.next;
                n.prev = root;
                root = n;
                hmap.put(key, n);
            } else {

                node n = hmap.get(key);
                n.val = value;
                hmap.put(key, n);
            }
        } else {
            deleteAtLast();
        }
    }

    public void deleteAtLast(){

        node temp = root;

        while(temp.next!=null){
            temp = temp.next;
        }
        node x = temp.prev;
        x.next =null;
        temp.prev=null;


    }
}
