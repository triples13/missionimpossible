package com.learning.graph;

import java.util.ArrayList;
import java.util.List;

public class Component {

    int v;
   List<List<Integer>> connections;
   boolean[] traversed;

    Component(int v ){
        this.v=v;
        traversed = new boolean[v];
        connections = new ArrayList<>();

        for(int i=0;i<v;i++)
            connections.add(i,new ArrayList<>());


    }

}
