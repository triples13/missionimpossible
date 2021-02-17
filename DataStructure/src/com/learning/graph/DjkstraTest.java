package com.learning.graph;

import java.util.Map;

public class DjkstraTest {

    public static void main(String [] args){

        int [] [] connection ={{0,1,9},{0,2,6},{0,3,5},{0,4,3},{2,1,2},{2,3,4}};
        DjkstraAlgorithm djkstraAlgorithm = new DjkstraAlgorithm();
        Map<Integer,Integer> hmap =djkstraAlgorithm.shortestWeight(connection,5,0);
        System.out.println("hmap:"+hmap);
    }
}
