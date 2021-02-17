package com.learning.graph;

public class NetworkTraversal {

    public static  void main(String [] args){

        int [][] node = {{2,1,1},{2,3,1},{3,4,1}};
        int [][] node1 = {{1,2,1}};
        int [] [] node2 ={{1,2,1},{2,1,3}};


         int n=4;
        int k=2;

        Network networkTraversal = new Network();
   //    System.out.println("total delay time:" +networkTraversal.networkDelayTime(node,n,k));
     //   System.out.println("total delay time:" +networkTraversal.networkDelayTime(node1,2,1));
      System.out.println("total delay time:" +networkTraversal.networkDelayTime(node1,2,2));
     //   System.out.println("total delay time:" +networkTraversal.networkDelayTime(node2,2,2));
    }
}
