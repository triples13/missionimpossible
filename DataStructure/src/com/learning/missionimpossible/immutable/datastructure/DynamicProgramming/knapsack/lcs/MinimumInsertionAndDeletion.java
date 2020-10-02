package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

import static com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs.LongestSubStringDp.findLongestCommonSubStringDp;

public class MinimumInsertionAndDeletion {

    public static void main(String [] args){

        String str1 = "heap";
        String str2 = "pea";

        // it is a lcs question
        // longest common subsequence is ea
        // so to convert str1 to str2 we have to delete 2 strings
        // after deleting two strings to make it equal to str2 we
        //have to insert 1 string

        int longestCommon = findLongestCommonSubStringDp(str1,str2);

        // deletions required
         int deletions = str1.length()-longestCommon;
         int insertions = str2.length()-longestCommon;

         int totalOperations = insertions+deletions;
        System.out.println("total insertions and deletion:"+totalOperations);

    }
}
