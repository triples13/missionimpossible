package com.learning.missionimpossible.immutable.datastructure.DynamicProgramming.knapsack.matrixchainmultiplication;

public class minimumcostmatrix {

     static int minCost = Integer.MAX_VALUE;

    public static void main(String[] args) {

        int[] arr = {10, 30, 5, 60};

        // three matrix will be there
        //A1,A2,A3
        // A1= 10*30
        //A2 = 30*5
        // A3 = 5*60
        // final cost of matrix is no of multiplication A1*A2 ->(10*30) *(30*5)  ->resultant matrix is 10*5 ->50 elements

        // but we are doing 30 multiplication  to find one element so total multiplication we are doing is 50*30=1500
        // it will be cost

        // (AB)C-> (10*30*30*5)*5*60 -> 10*30*5(inner cost multiplying A*B) + 10*5*60(outer cost
        //


        // ABCD -> AB*CD-> total cost of multiplying AB + CD

       int minimumCostOfMultiplication = findTotalCostOfMultiplication(arr,1,arr.length-1);
        System.out.println("min cost:"+minimumCostOfMultiplication);

    }

    public static int findTotalCostOfMultiplication(int[] arr,int i, int j ){


        if(i>=j)
             return 0;


        for(int k=i;k<j;k++){
            // cost(AB)+cost(CD) + final cost of multiplication
            int localminimum = findTotalCostOfMultiplication(arr,i,k)+findTotalCostOfMultiplication(arr,k+1,j)
            +arr[i-1]*arr[k]*arr[j];

            minCost = Math.min(localminimum,minCost);
        }

        return  minCost;
    }
}

