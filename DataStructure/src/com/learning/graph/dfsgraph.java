package com.learning.graph;

public class dfsgraph {

    public static void main(String [] args){

        Node node40 = new Node(40);
        Node node20 = new Node(20);
        Node node10 = new Node(10);
        Node node30 = new Node(30);
        Node node50 = new Node(50);
        Node node60 = new Node(60);
        Node node70 = new Node(70);


        node40.addNeighbours(node20);
        node40.addNeighbours(node10);
        node10.addNeighbours(node20);
        node10.addNeighbours(node30);
        node20.addNeighbours(node10);
        node20.addNeighbours(node30);
        node20.addNeighbours(node50);
        node20.addNeighbours(node60);
        node30.addNeighbours(node20);
        node30.addNeighbours(node10);
        node30.addNeighbours(node60);
        node50.addNeighbours(node20);
        node50.addNeighbours(node70);
        node60.addNeighbours(node70);
        node60.addNeighbours(node20);
        node70.addNeighbours(node50);
        node70.addNeighbours(node60);

        BuildGraph buildGraph = new BuildGraph();
      //  buildGraph.traverseGraph(node40);
        buildGraph.traverseGraphUsingStack(node40);

    }
}
