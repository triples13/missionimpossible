package com.learning.missionimpossible.immutable.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    TrieNode root;

    Trie(){
       root = new TrieNode();
    }
    public void addWord(String word){

        System.out.println("word:"+word);
        if(searchPrefix(word))
            return;

        else{

            TrieNode temp = root;

            for(int i=0;i<word.length();i++){

                TrieNode[]  nodes = temp.childrens;
                 TrieNode node = new TrieNode();
                 node.c = word.charAt(i);
                 nodes[word.charAt(i)-'a'] =node;
                 temp=node;

            }

            temp.end = true;

        }
    }

    public boolean searchPrefix(String prefix){

        TrieNode temp = root;

        for(int i=0;i<prefix.length();i++){

            TrieNode [] childrens =temp.childrens;

               if(childrens[prefix.charAt(i)-'a']!=null){
                   temp=childrens[prefix.charAt(i)-'a'];
               }
               else
                   return  false;
        }

        if(temp.end ==true)
            return  true;

        return false;
    }

    public List<String> autoComplete(String prefix){

        TrieNode temp = root;

        for(int i=0;i<prefix.length();i++){

            TrieNode [] childrens = temp.childrens;

            if(childrens[prefix.charAt(i)-'a']==null)
                return  new ArrayList<>();

            else {
                TrieNode node = childrens[prefix.charAt(i) - 'a'];

                temp=node;
            }
        }
        if(temp.end==true)
            return new ArrayList<>();

       return findAllChildrens(temp);
    }

    public List<String> findAllChildrens(TrieNode root){


        List mylist = new ArrayList();
        if(root.end==true){

            mylist.add(root.c);
            return mylist;
        }

        TrieNode temp =root;

        TrieNode [] childrens = temp.childrens;

       for(int i=0;i<childrens.length;i++){

           if(childrens[i]!=null) {
               mylist.addAll( findAllChildrens(childrens[i]));
           }
       }

       return  mylist;
    }
}
