package com.learning.graph;

import java.util.*;

public class BfsImplementation {

    int vertex;
    private Map<Integer, List<Integer>> graphStructure;
    private Map<Integer,Integer> degreeOfMap;

    BfsImplementation(int vertex){

        graphStructure = new HashMap<>();
        degreeOfMap = new HashMap<>();
        this.vertex=vertex;

        for(int i=0;i<vertex;i++) {
            graphStructure.put(i, new ArrayList<>());
            degreeOfMap.put(i, 0);
        }
    }

    public void buildGraph(int [][] graphRelation){

        for(int i=0;i<vertex;i++){

            int parent = graphRelation[i][0];
            int child = graphRelation[i][1];

            graphStructure.get(parent).add(child);
            degreeOfMap.put(child,degreeOfMap.get(child)+1);
        }
    }

    public  List<Integer> topologicalSorting(){

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> sortedList = new ArrayList<>();

        for(Map.Entry<Integer,Integer> map:degreeOfMap.entrySet())
        {
            if(map.getValue()==0)
                queue.add(map.getKey());
        }

        while(!queue.isEmpty()){

            int vertx = queue.poll();
            sortedList.add(vertx);
            List<Integer> childrens = graphStructure.get(vertx);
            for(int x:childrens) {
                degreeOfMap.put(x, degreeOfMap.get(x) - 1);

                if(degreeOfMap.get(x)==0)
                    queue.add(x);
            }
        }

        if(sortedList.size()!=vertex)
            return new ArrayList<>();

        return sortedList;
    }
}
