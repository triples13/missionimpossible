package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs;

import static com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs.LongestCommonSubSequenceDp.findLongestCommonSubsequenceDp;
import static com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.lcs.LongestSubStringDp.findLongestCommonSubStringDp;

public class MinimumDeletionToMakeStringPalindromic {

    //lcs from original String and reversed string will be palindromic

    public static void main(String[] args) {
        String str1 = "agbcba";
        StringBuilder sb = new StringBuilder(str1);

        String str2 = sb.reverse().toString();

        int longestCommon = findLongestCommonSubsequenceDp(str1, str2);

        System.out.println("longest common:"+longestCommon);

        // deletions required
        int deletions = str1.length() - longestCommon;



        System.out.println("total  deletion:" + deletions);
    }
}
