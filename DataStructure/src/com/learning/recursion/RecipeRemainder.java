package com.learning.recursion;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RecipeRemainder {

    static int[]  calculateRemainders(int[] proportions,int[] availableGrams) {
        int[] remaining_grams=new int [proportions.length];

        int []unit=new int[proportions.length];
        for(int i=0;i<proportions.length;i++){
            unit[i]=availableGrams[i]/proportions[i];
        }
        int[] smallestUnit=findMinimumUnit(unit);

        int pos=smallestUnit[1];
        for(int i=0;i<proportions.length;i++){
            remaining_grams[i]=availableGrams[i]-((availableGrams[pos]*proportions[i])/proportions[pos]);
        }
        return remaining_grams;



    }

    public static int [] findMinimumUnit(int [] unit){

        int smallest=Integer.MAX_VALUE;
        int [] posSmall=new int[2];
        int pos=0;
        for(int i=0;i<unit.length;i++){
            if(smallest>unit[i]){
                smallest=unit[i];
                pos=i;
            }
        }
        posSmall[0]=smallest;
        posSmall[1]=pos;
        return posSmall;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] proportions = Arrays.stream(in.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
        int[] availableGrams = Arrays.stream(in.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();

        int[] remainder = calculateRemainders(proportions,availableGrams) ;

        System.out.println(Arrays.stream(remainder)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));
    }
}

