package com.learning.missionimpossible.immutable.datastructure.recursion;

import java.util.ArrayList;
import java.util.List;

public class josephusproblem {

    public static void main(String [] args){

        List<Integer> joshepusList = new ArrayList<>();

        for(int i=1;i<=41;i++)
            joshepusList.add(i-1,i);


        System.out.println( "position:"+findPerfectPosition(joshepusList,2,0));
    }

    public static  int findPerfectPosition(List<Integer> joshepusList,int k,int index){

        if(joshepusList.size()==1) {

           return joshepusList.iterator().next();
        }


        index = (index+k-1)%joshepusList.size();
        joshepusList.remove(index);

        //after removing index's will shift so we are not increasing count by 1
        return  findPerfectPosition(joshepusList,k,index);
    }
}
