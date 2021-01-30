package com.learning.graph;

import java.util.Stack;

public class BuildGraph {

    public void traverseGraph(Node node){


        if(node.getChildren()==null)
            return;

        node.setVisited(true);
        System.out.println("visited node:"+node.getData());

        for(int i=0;i<node.getChildren().size();i++){

              Node children = node.getChildren().get(i);
              if(children!=null && !children.isVisited())
                  traverseGraph(children);
        }

    }

    public void traverseGraphUsingStack(Node node){
        Stack<Node> stack = new Stack<>();

        stack.push(node);

        while(!stack.isEmpty()){

              Node node1 = stack.pop();

            System.out.println(node1.getData());

           for(int i=0;i<node1.getChildren().size();i++) {
               Node node2 = node1.getChildren().get(i);
               if(node2!=null && !node2.isVisited()) {
                   node2.setVisited(true);
                   stack.push(node2);
               }
           }
        }
    }
}
