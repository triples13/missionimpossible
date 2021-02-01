package com.learning.graph;

public class TestComponent {
    public static void main(String [] args){

        /*Component component = new Component(5);
        GraphComponent graphComponent = new GraphComponent(component);

        graphComponent.buildUndirectedGraph(1,0);
        graphComponent.buildUndirectedGraph(2,3);
        graphComponent.buildUndirectedGraph(3,4);

        graphComponent.findConnections();*/


       /* Component component1 = new Component(6);
        GraphComponent graph = new GraphComponent(component1);

        *//*graph.buildUndirectedGraph(0,1);
        graph.buildUndirectedGraph(1,2);
        graph.buildUndirectedGraph(2,3);*//*

        graph.buildDirectedGraph(0,1);
        graph.buildDirectedGraph(1,2);
        graph.buildDirectedGraph(3,4);
        graph.buildDirectedGraph(4,5);
        graph.buildDirectedGraph(5,3);
*/


       // System.out.println("cycle exist:"+graph.findIfCycleExist());

     //   System.out.printf("cycle exist in directed graph:"+graph.checkCycleInDirectedGraph());

        //find all connected components in graph

        Component component2 = new Component(10);
        GraphComponent graph1 = new GraphComponent(component2);

        /*graph.buildUndirectedGraph(0,1);
        graph.buildUndirectedGraph(1,2);
        graph.buildUndirectedGraph(2,3);*/

        graph1.buildDirectedGraph(0,1);
        graph1.buildDirectedGraph(1,2);
        graph1.buildDirectedGraph(3,4);
        graph1.buildDirectedGraph(4,5);
        graph1.buildDirectedGraph(5,3);
        graph1.buildDirectedGraph(6,7);
        graph1.buildDirectedGraph(8,9);

        System.out.printf("total number of connected components:"+graph1.checkTotalComponents());













    }
}
