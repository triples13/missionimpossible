package com.learning.missionimpossible.immutable.datastructure.TrieNodeDS;

public class TypeAheadTest {

    public static void main(String [] args){

        TypeAhead typeAhead = new TypeAhead();

        typeAhead.insert("amazon");
        typeAhead.insert("amazon prime");
        typeAhead.insert("amazing");

        System.out.println("word found:"+ typeAhead.search("amazinw"));
    }
}
