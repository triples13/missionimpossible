package com.learning;

import com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.decorator.Test;

import java.util.*;

public class Testcue {

    public static void main(String [] args){
        int [] arr ={3,4,7,1,2,9,8};

        Testcue test = new Testcue();

        Map<Integer,List<Duplicate>> dupMap=test.findIfPairsExist(arr);

        System.out.println(dupMap);
    }

    public Map<Integer,List<Duplicate>>  findIfPairsExist(int [] arr){



        Map<Integer, List<Duplicate>> duplicateMap = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                int sum = arr[i]+arr[j];

                if(duplicateMap.containsKey(sum)){
                    Duplicate dup = new Duplicate(arr[i],arr[j]);

                   List<Duplicate> duplicateList= duplicateMap.get(sum);
                   duplicateList.add(dup);
                    duplicateMap.put(sum,duplicateList);
                }
                else {
                    Duplicate dup1 = new Duplicate(arr[i], arr[j]);
                    List<Duplicate> dupList = new ArrayList<>();
                    dupList.add(dup1);
                    duplicateMap.put(sum, dupList);
                }
            }
        }

        return duplicateMap;
    }


    class Duplicate{
        int x;
        int y;
        Duplicate(int x,int y){
            this.x=x;
            this.y=y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "Duplicate{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
