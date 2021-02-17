package com.learning.graph;

import java.util.List;

public class TestBfsImplementation {

    public static void main(String [] args){

        BfsImplementation bfsImplementation = new BfsImplementation(4);
       bfsImplementation.buildGraph(
                new int[][] { new int[] { 3, 2 }, new int[] { 3, 0 }, new int[] { 2, 0 }, new int[] { 2, 1 } });

        List<Integer> result = bfsImplementation.topologicalSorting();
        System.out.println(result);

        BfsImplementation bfsImplementation1 = new BfsImplementation(5);

        bfsImplementation1.buildGraph(
                new int[][] { new int[] { 4, 2 }, new int[] { 4, 3 }, new int[] { 2, 0 },
                        new int[] { 2, 1 }, new int[] { 3, 1 } });


        List<Integer> result1 = bfsImplementation1.topologicalSorting();
        System.out.println(result1);


    }
}
