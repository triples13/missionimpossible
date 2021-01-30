package com.learning.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphComponent {

    private Component graph;
    private  boolean[] traversed;
    private int vertices;
    GraphComponent(Component graph){
        this.graph = graph;
        this.traversed = graph.traversed;
        this.vertices = graph.v;

    }

    public void buildUndirectedGraph(int source,int destination){

       graph.connections.get(source).add(destination);
       graph.connections.get(destination).add(source);
    }

    public void buildDirectedGraph(int source,int destination){
        graph.connections.get(source).add(destination);
    }

    public void findConnections(){


        for(int i=0;i<vertices;i++){
            if(!traversed[i]) {
                traverseNode(i);
                System.out.println();
            }
        }
    }

    public void traverseNode(int x){

        if(traversed[x] || graph.connections.get(x)==null)
            return;

         traversed[x]=true;
        System.out.print(x);

         List<Integer> traversalList = graph.connections.get(x);

         for(int i=0;i<traversalList.size();i++)
         {
             int nodeToTraverse = traversalList.get(i);
             if(!traversed[nodeToTraverse])
                 traverseNode(nodeToTraverse);
         }

    }

   public boolean findIfCycleExist(){

        for(int i=0;i<vertices;i++)
            traversed[i] = false;



           if (checkIfCycleExist(0, -1))
               return true;



        return false;
   }

   public boolean checkIfCycleExist(int vertices,int parent){


          traversed[vertices] =true;
        List<Integer> edges = graph.connections.get(vertices);

        for(int x:edges)
        {
            if(!traversed[x]) {
                if(checkIfCycleExist(x, vertices))
                    return true;
            }
            else if(traversed[x] && parent!=x)
                return true;
        }

        return false;
   }


    public boolean checkForCycle (int x)
    {
        if(traversed[x])
            return true;

        traversed[x]=true;

        List<Integer> edgeList = this.graph.connections.get(x);

        for(int z:edgeList)
            checkForCycle(x);

        return false;
    }
}
