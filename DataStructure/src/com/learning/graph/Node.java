package com.learning.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private int data;
    private List<Node> children;
    private boolean visited;

    Node(int data)
    {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void addNeighbours(Node node){
        this.children.add(node);
    }
}
