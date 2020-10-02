package com.learning.missionimpossible.immutable.datastructure.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindBox {


    public static void main(String [] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  firstLine = br.readLine();

        String[] strs = firstLine.trim().split("\\s+");
        int noOfContainers = Integer.parseInt(strs[0]);

        String  secondLine = br.readLine();
        String[] str1 = secondLine.trim().split("\\s+");

        String  thirdLine = br.readLine();
        String[] str2 = thirdLine.trim().split("\\s+");

        int [] containers = new int [str1.length];

        for(int i=0;i<str1.length;i++){
            containers[i]= Integer.parseInt(str1[i]);
        }


        Map<Integer, List<Integer>> hmap = new HashMap<>();

        int limit =1;
        int upperLimit =0;
        for(int i=0;i<containers.length;i++){

             upperLimit = upperLimit+containers[i];

            List<Integer> myList = new ArrayList<>();
            for(int y=limit;y<=upperLimit;y++){

                myList.add(y);
            }
            hmap.put(i+1,myList);

            limit=limit+upperLimit;
        }

        int q = Integer.parseInt(str2[0]);

        for(int i=0;i<q;i++){

            String  x = br.readLine();
           String [] x1 =  x.trim().split("\\s+");
            int marble = Integer.parseInt(x1[0]);

            System.out.println(findMarble(marble,hmap));
        }


    }

    public static int findMarble(int marble,Map<Integer,List<Integer>> hmap){

        int box =0;
        for(Map.Entry<Integer,List<Integer>> entry:hmap.entrySet()) {
            if (entry.getValue().contains(marble)) {
                box = entry.getKey();
                break;
            }
        }

        return  box;
    }
}
