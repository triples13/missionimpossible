package com.learning.missionimpossible.immutable.datastructure;

import java.util.ArrayList;
import java.util.List;

public class TrieNode {

    public TrieNode[] childrens;
    public char c;
    public TrieNode root;
    public boolean end;

    TrieNode(){
        childrens = new TrieNode[26];
        c = ' ' ;
    }

}
