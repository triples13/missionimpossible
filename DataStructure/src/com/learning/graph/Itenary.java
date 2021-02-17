package com.learning.graph;

import java.util.*;

public class Itenary {

    private Map<String, PriorityQueue<String>> graphStructure;
    public List<String> findItinerary(List<List<String>> tickets) {

        graphStructure = new HashMap<>();

        for(int i=0;i<tickets.size();i++){

            String parent = tickets.get(i).get(0);
            String child = tickets.get(i).get(1);

            if(graphStructure.containsKey(parent))
                graphStructure.get(parent).add(child);
            else{
                PriorityQueue<String> childrens = new PriorityQueue<String>();
                childrens.add(child);
                graphStructure.put(parent,childrens);
            }

        }

        List<String> itenary = new ArrayList<>();
        dfs("JFK",itenary);
        return itenary;

    }

    public void dfs(String s, List<String> itenary){

        PriorityQueue<String> childrens = graphStructure.get(s);
        if(childrens!=null) {

            while (!childrens.isEmpty())
                dfs(childrens.poll(),itenary);
        }

        itenary.add(0,s);
    }
}
