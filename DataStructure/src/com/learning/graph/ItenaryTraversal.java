package com.learning.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItenaryTraversal {

public static  void main(String [] args){

    Itenary itenary = new Itenary();
    List<List<String>> list = new ArrayList<>();
    list.add( Arrays.asList("JFK","SFO"));
    list.add( Arrays.asList("JFK","ATL"));
    list.add( Arrays.asList("SFO","ATL"));
    list.add( Arrays.asList("ATL","JFK"));
    list.add( Arrays.asList("ATL","SFO"));

    System.out.println("traversal:"+itenary.findItinerary(list));

}
}
