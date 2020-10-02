package com.learning.recursion;
import  java.util.*;
public class Sol {


    public static  void main (String []args){
        Sol a = new Sol();
        int x= 5^7;
        System.out.println("xor:"+x);
        System.out.println( a.subdomainVisits(new String[]{"9001 discuss.leetcode.com"}));
    }
    public List<String> subdomainVisits(String[] cpdomains) {

        Map<String,Integer> hmap = new HashMap<>();
        List<String> myList = new LinkedList<>();
        for(String domain:cpdomains){
            String [] domainCount = domain.split(" ");

            int count = Integer.valueOf(domainCount[0]);

            System.out.println("string:"+count);
            System.out.println("string:"+domainCount[1]);
            String []domains = domainCount[1].split("\\.");
            System.out.println("length:"+domains.length);
            for(String str:domains){
                System.out.println("strings:"+str);
            }

            String curr="";
            for(int i=domains.length-1;i>=0;i--){

                System.out.println("domain:"+domains[i]);
                curr= domains[i]+ (i < domains.length - 1 ? "." : "")+curr;
                System.out.println(curr);
                hmap.put(curr, hmap.getOrDefault(curr, 0) + count);

            }

        }

        System.out.println(hmap);
        for(Map.Entry<String,Integer> entry:hmap.entrySet()){
            myList.add(entry.getKey()+ " "+entry.getValue());
        }

        return myList;

    }


}
