package com.learning.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    public boolean checkCycleInDirectedGraph(){
        for(int i=0;i<vertices;i++)
            traversed[i]=false;

        for(int i=0;i<vertices;i++){
            if(!traversed[i]) {
                if (checkCycleGraph(i,new Stack<>()))
                    return true;
            }

        }

        return false;
    }

    public int checkTotalComponents(){
        for(int i=0;i<vertices;i++)
            traversed[i]=false;

        int count=0;
        for(int i=0;i<vertices;i++){
            if(!traversed[i]) {
                 checkCycleGraph(i,new Stack<>());
                  count++;
            }
        }

        return count;

    }

    public boolean checkCycleGraph(int v,Stack<Integer> stack) {



        List<Integer> edgeList = graph.connections.get(v);
        stack.push(v);
        traversed[v]=true;

            for (int x : edgeList) {

                if (!traversed[x]) {
                    if (checkCycleGraph(x, stack))
                        return true;
                }

                else if(traversed[x] && stack.contains(x))
                    return true;


            }

        stack.pop();
        return  false;
    }

    public List<List<Integer>> findAllComponents(){

        for(int i=0;i<vertices;i++)
            traversed[i]=false;

        List<List<Integer>> outerList = new ArrayList<>();

        for(int i=0;i<vertices;i++){
            if(!traversed[i]) {
                List<Integer> innerList = new ArrayList<>();
                findConnectedComponents(i,innerList);
                outerList.add(innerList);
            }


        }

        return outerList;

    }
    public void findConnectedComponents(int vertex,List<Integer> component){

        if(traversed[vertex])
            return;

        traversed[vertex]=true;
        component.add(vertex);

        List<Integer> edgeList = graph.connections.get(vertex);

        for(int x:edgeList)
        {
            if(!traversed[x])
                findConnectedComponents(x,component);
        }


    }

    public List<Integer> sortGraphTopological(){

        for(int i=0;i<vertices;i++)
            traversed[i]=false;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<vertices;i++){
            if(!traversed[i])
                sortGraphTopological(i,stack);
        }

        List<Integer> list = new ArrayList<>();
        while(!stack.isEmpty())
            list.add(stack.pop());

        return list;

    }

    public void sortGraphTopological(int vertex, Stack<Integer> stack) {

        if (traversed[vertex])
            return;

        traversed[vertex] = true;

        List<Integer> edgeList = graph.connections.get(vertex);


            for (int x : edgeList) {

                if (!traversed[x]) {
                    sortGraphTopological(vertex, stack);
                    stack.push(x);
                }

            }

            if(!stack.contains(vertex))
                stack.push(vertex);

    }
}
