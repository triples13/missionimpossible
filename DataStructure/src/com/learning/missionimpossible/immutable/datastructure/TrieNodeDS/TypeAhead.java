package com.learning.missionimpossible.immutable.datastructure.TrieNodeDS;




public class TypeAhead {

    private TrieNode root;
    TypeAhead(){

        root = new TrieNode();
        root.data = ' ';

    }

    public void insert(String word){

        if(search(word)==true)
            return;

        TrieNode temp = root;

        for(char c:word.toCharArray()){

            TrieNode [] childs =temp.childrens;

            if(childs[Math.abs(c-'a')]==null){
                TrieNode node = new TrieNode();
                node.data =c;
                childs[Math.abs(c-'a')]=node;
            }

            temp = childs[Math.abs(c-'a')];
        }

        temp.isEnd =true;
    }

    public boolean search(String word){

        TrieNode temp = root;

        for(char c:word.toCharArray()){

           TrieNode[] childs = temp.childrens;
            if(childs[Math.abs(c-'a')]==null)
                return false;
            else
                temp = childs[Math.abs(c-'a')];
        }

        if(temp.isEnd==true)
            return true;

        return false;
    }





}
class TrieNode{

    TrieNode [] childrens;
    boolean isEnd;

    char data;

    TrieNode(){
        childrens= new TrieNode[226];
        isEnd = false;
    }
}