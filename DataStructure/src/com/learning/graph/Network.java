package com.learning.graph;

import java.util.*;

public class Network {

    private Map<Integer, List<EdgeW>> connections;
    private   boolean[] pathTraversed;
    private int [] shortestConnection;
    public int networkDelayTime(int[][] times, int n, int k) {

        connections =new HashMap<>();
        pathTraversed = new boolean[n];
        shortestConnection =  new int [n];
        for(int i=1;i<=n;i++)
            connections.put(i,new ArrayList<>());

        for(int i=0;i<n;i++)
            pathTraversed[i]=false;

        for(int i=0;i<n;i++)
            shortestConnection[i]=Integer.MAX_VALUE;


        for(int i=0;i<times.length;i++){

            int parent = times[i][0];
            int child = times [i][1];
            int weight = times[i][2];

            EdgeW edge = new EdgeW(child,weight);

              if(connections.containsKey(parent)){
                  List<EdgeW> edgeList = connections.get(parent);
                  edgeList.add(edge);
                  connections.put(parent,edgeList);
              }
        }

        PriorityQueue<OnFlyCalculatedWeight> priorityQueue = new PriorityQueue<>((e1,e2)->e1.getWeight()-e2.getWeight());
        priorityQueue.add(new OnFlyCalculatedWeight(k,0));


        shortestConnection[k-1]=0;
        while(!priorityQueue.isEmpty()){

          OnFlyCalculatedWeight onFlyCalculatedWeight =   priorityQueue.poll();
           List<EdgeW> edgeWList =  connections.get(onFlyCalculatedWeight.getSource());

          int parentW = onFlyCalculatedWeight.getWeight();

          for(EdgeW edgeW:edgeWList){

              int currentWeight = parentW+edgeW.weight;
              int child = edgeW.child-1;

              if(!pathTraversed[child]  && currentWeight<shortestConnection[child])
              {
                  shortestConnection[child]=currentWeight;
                  priorityQueue.add(new OnFlyCalculatedWeight(edgeW.child,currentWeight));
              }
          }
          pathTraversed[onFlyCalculatedWeight.getSource()-1]=true;


        }

        int globalMax = Integer.MIN_VALUE;



        for(int i=0;i<n;i++) {

            System.out.println("conn:"+shortestConnection[i]);
            if (shortestConnection[i] == Integer.MAX_VALUE)
                return -1;

            else if (shortestConnection[i] > globalMax)
                globalMax = shortestConnection[i];


        }


        return  globalMax;
        }




}

class OnFlyCalculatedWeight{

    int source;
    int weight;

    OnFlyCalculatedWeight(int source,int weight){
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




    class EdgeW{

        int child;
        int weight;

        EdgeW(int y,int z){

            this.child=y;
            this.weight=z;
        }
    }




