package com.learning.graph;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class DjkstraAlgorithm {

    private int parent;
    private int children;
    private int weight;

    private Map<Integer, List<Edge>> connection;
    private int nodes;
    private Map<Integer,Integer> weights;
    private boolean [] traversal;





    public Map<Integer,Integer> shortestWeight(int [] [] order,int nodes,int nodeToStart){
        connection = new HashMap<>();
        weights =  new HashMap<>();
        traversal = new boolean[nodes];

        for(int i=0;i<nodes;i++)
            connection.put(i,new ArrayList<>());

        for(int i=0;i<nodes;i++)
        {
            if(i==nodeToStart)
                weights.put(i,0);
            else
                weights.put(i,Integer.MAX_VALUE);
        }

        for(int i=0;i<nodes;i++){

            int parent = order[i][0];
            int children = order [i][1];
            int weight = order [i][2];

            Edge edge = new Edge(children,weight);

            if(connection.containsKey(parent)) {
                List<Edge> edgeList = connection.get(parent);
                edgeList.add(edge);
                connection.put(parent,edgeList);
            }

        }

        for(int i=0;i<nodes;i++)
            traversal[i]=false;

        PriorityQueue<EdgeWeight> queue = new PriorityQueue<EdgeWeight>((e1, e2)->(e1.getWeight()-e2.getWeight()));

        queue.add(new EdgeWeight(nodeToStart,0));

        int noOfVisitedNodes=0;

        while(noOfVisitedNodes!=nodes-1){

            EdgeWeight edgeWeight =  queue.poll();
            List<Edge> childrens = connection.get(edgeWeight.getSource());

            int parentWeight = edgeWeight.getWeight();
            if(childrens!=null) {
                for (Edge edge : childrens) {
                    if (!traversal[edge.getChildren()]) {
                        int weight = parentWeight + edge.getWeight();
                        if (weights.get(edge.getChildren()) > weight) {
                            weights.put(edge.getChildren(), weight);
                            queue.add(new EdgeWeight(edge.getChildren(), weight));
                        }
                    }
                }
            }

            traversal[edgeWeight.getSource()]=true;
            noOfVisitedNodes++;

        }

  return weights;
    }

}

class EdgeWeight{
    int source;
    int weight;

    EdgeWeight(int source,int weight)
    {
        this.source=source;
        this.weight=weight;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Edge{


    private int children;
    private int weight;;

    Edge(int children,int weight)
    {
        this.children = children;
        this.weight = weight;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
