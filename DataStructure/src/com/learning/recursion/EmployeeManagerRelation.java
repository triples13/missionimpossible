package com.learning.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManagerRelation {

    public static void main(String [] args){

        List<String> employees = new ArrayList<>();
        employees.add("P1,P2");
        employees.add("P1,P3");
        employees.add("P3,P4");

        findAllEmployeesSubordinates(employees);
    }

    public static void findAllEmployeesSubordinates(List<String> employees){

        Map<String,List<String>>  hmap  = new HashMap<>();

        for(String str:employees)
        {
            String [] token = str.split(",");
            String parent = token[0];
            String child = token[1];

            if(!hmap.containsKey(parent)) {
                List<String> subs = new ArrayList<>();
                subs.add(child);
                hmap.put(parent, subs);
            }
            else
            {
                List<String> subs = hmap.get(parent);
                subs.add(child);
                hmap.put(parent,subs);
            }

            if(!hmap.containsKey(child))
                hmap.put(child,new ArrayList<>());

        }

        Map<String,List<String>> result = new HashMap<>();


       for(String manager:hmap.keySet()){
           List<String> subs = findAllSubs(manager,hmap,result);
           result.put(manager,subs);
       }

        System.out.println(result);
    }

    public static  List<String> findAllSubs(String manager,Map<String,List<String>> subs,Map<String,List<String>> result){

         if(result.containsKey(manager))
             return result.get(manager);

         List<String> managers = subs.get(manager);


         for(String man:new ArrayList<>(managers)){

               List<String> subordinates = findAllSubs(man,subs,result);

               if(subordinates!=null)
                   managers.addAll(subordinates);
         }

         result.put(manager,managers);

         return  managers;
    }
}


