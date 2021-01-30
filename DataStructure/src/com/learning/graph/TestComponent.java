package com.learning.graph;

public class TestComponent {
    public static void main(String [] args){

        /*Component component = new Component(5);
        GraphComponent graphComponent = new GraphComponent(component);

        graphComponent.buildUndirectedGraph(1,0);
        graphComponent.buildUndirectedGraph(2,3);
        graphComponent.buildUndirectedGraph(3,4);

        graphComponent.findConnections();*/


        Component component1 = new Component(4);
        GraphComponent graph = new GraphComponent(component1);

        graph.buildUndirectedGraph(0,1);
        graph.buildUndirectedGraph(1,2);
        graph.buildUndirectedGraph(2,3);


        System.out.println("cycle exist:"+graph.findIfCycleExist());







    }
}
