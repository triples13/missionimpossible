package com.learning.missionimpossible.immutable.datastructure;

import java.io.ObjectInputStream;
import java.util.List;

public class TestTrieNode {

    public static  void main(String [] args){

        Trie trie = new Trie();
        trie.addWord("amazon");
        trie.addWord("amazonprime");
        trie.addWord("amazonvideo");

        List<String> mylist = trie.autoComplete("amaz");


        for(String s:mylist){
            System.out.println(s);
        }
    }
}
