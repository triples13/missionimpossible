package com.learning.graph;

public class TopologicalSort {

    public static void main(String [] args){
        Component graph =  new Component(6);
        GraphComponent graphComponent = new GraphComponent(graph);
        graphComponent.buildDirectedGraph(3,0);
        graphComponent.buildDirectedGraph(0,1);
        graphComponent.buildDirectedGraph(1,2);
        graphComponent.buildDirectedGraph(3,4);
        graphComponent.buildDirectedGraph(5,3);
        graphComponent.buildDirectedGraph(5,4);
        graphComponent.buildDirectedGraph(4,2);

        System.out.println("topological sort is:"+graphComponent.sortGraphTopological());

    }
}
