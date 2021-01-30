package com.learning.missionimpossible.immutable.datastructure.HeapProblems;


import java.util.*;
import java.util.stream.Collectors;

/*

Given the number of five-star and total reviews for each product a company sells, as well as the threshold percentage, what is the minimum number of additional five-star reviews the company needs to become five star seller.
For ex, there are 3 products (n=3) with productRatings =[[4,4],[1,2],[3,6]], percentage rating threshold = 77.
[1,2] indicates => [1 (five star reviews) ,2 (total reviews)].
We need to get the seller reach the threshold with minimum number of additional five star reviews.

Before we add more five star reviews, the percentage for this seller is ((4/4) + (1/2) + (3/6))/3 = 66.66%
If we add a five star review to 2nd product, ((4/4) + (2/3) + (3/6))/3 = 72.22%
If we add another five star review to 2nd product, ((4/4) + (3/4) + (3/6))/3 = 75%
If we add a five star review to 3rd product, ((4/4) + (3/4) + (4/7))/3 = 77.38%
At this point, 77% (threshold) is met. Therefore, answer is 3 (because that is the minimum five star reviews we need to add, to get the seller reach the threshold).
 */
public class AmazonFiveStarSeller {

    public static void main(String [] args){

        List<List<Integer>> ratings = new ArrayList(){
            {
                add(Arrays.asList(4,4));
                add(Arrays.asList(1,2));
                add(Arrays.asList(3,6));
            }
        };
        int threshold = 77;

        System.out.println("minimum steps:"+findMinimumSeller(ratings,threshold));
    }

    public static int findMinimumSeller(List<List<Integer>> ratings, int threshold){

        // will be stored as maximum jump in percentage when we add 1
        PriorityQueue<List<Integer>> maxHeap = new PriorityQueue<>((l1,l2)->getMaxDiff(l2)-getMaxDiff(l1));


        int i=0;


       for(List<Integer> integerList:ratings)
           maxHeap.add(integerList);

        int minimumSteps=0;
        while(getPercentage(ratings)<threshold){

            List<Integer> rate = maxHeap.poll();

            rate.set(0,rate.get(0)+1);
            rate.set(1,rate.get(1)+1);


            maxHeap.add(rate);

          minimumSteps++;
        }

        return minimumSteps;
    }

    public static int getPercentage(List<List<Integer>> ratings){

       List<Product> productList = ratings.stream().map(e->{return  new Product(e.get(0),e.get(1));}).collect(Collectors.toList());

       double average;

       float sum =0;
       for(Product product:productList){
          sum+= (float)product.noOfFiveStar/product.totalReviews;
       }
       average = 100*(sum/productList.size());

       return (int)average;
    }

    public static int getMaxDiff(List<Integer> p){

        double currRating = 100.0 * p.get(0) / p.get(1);
        double newRating = 100.0 * (p.get(0)+1) / (p.get(1)+1);
        return (int)(newRating - currRating);
    }
}



class Product{

    int noOfFiveStar;
    int totalReviews;

    Product(int x,int y){
        noOfFiveStar = x;
        totalReviews =y;
    }
}
