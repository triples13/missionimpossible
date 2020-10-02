package com.learning.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayOperation {

    public static Set<Integer> newSet=new HashSet<>();
    public static void main(String []args){

       /* int []arr={-1, 1, 2, -3, -4, -1, 6, -5, -9, 9,-2,-6,-10,-20,50,60,-97,89,56,78,-23,-34};
        placeArray(arr);
        int []arr1={0,1,2,0,3,0};
        placeZeroes(arr1);
        maximumSumSlidingWindow(arr1,3);
        int []arr3={3,5,4,2};*/

   /*     final List<Integer> a=new ArrayList<>();
        a.add(100);
        a.add(100);
        a.add(100);
        a.add(100);
        a.add(100);
        System.out.println("data:"+maximumGap(a));*/
       /* int []arr={0,0,1,1,0,2,1,0,2};
        DutchProblem(arr);
        char []arr1={'1','2','3','3','2','1'};
        System.out.println("total no of ways:"+totalNoways(arr1,6 ));*/
        String plaindrome="abaabaababa";
        System.out.println(LongestPalindrome(plaindrome));
    }

    public static void maximumSumSlidingWindow(int []arr,int d){
        int prevsum=0;
        int currentsum=0;
        int maximumsum=Integer.MIN_VALUE;
        for(int i=0;i<d;i++){
            prevsum+=arr[i];
        }
        for(int i=d;i<arr.length;i++){
            currentsum=(prevsum+arr[i])-arr[i-d];
            if(currentsum>maximumsum){
                maximumsum=currentsum;
            }

            prevsum=currentsum;
        }
        System.out.println("maximum sum is:"+maximumsum);
    }
    public static void placeZeroes(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while (count<arr.length){
            arr[count++]=0;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void placeArray(int []arr){

       int firstptr=0;
       int lastptr=arr.length-1;
       while(firstptr!=lastptr  && firstptr<arr.length && lastptr>0){

           if(arr[firstptr]<0 && arr[lastptr]>0){
               firstptr++;
               lastptr--;
           }
           else if(arr[firstptr]>0 && arr[lastptr]<0){
               int temp=arr[firstptr];
               arr[firstptr]=arr[lastptr];
               arr[lastptr]=temp;

           }
           else if(arr[firstptr]>0 && arr[lastptr]>0){
               lastptr--;
           }
           else if(arr[firstptr]<0 && arr[lastptr]<0){
               firstptr++;
           }
       }

       for(int i=0;i<arr.length;i++){
           System.out.printf(arr[i]+",");
       }
    }

    public static int maximumGap(final List<Integer> A) {

        int firstptr=0;
        int lastptr=A.size()-1;
        int diff=0;
        int maxdiff=-1;
        while(firstptr<lastptr){




                if(A.get(lastptr)>A.get(firstptr)){
                    int difference=lastptr-firstptr;
                    if(difference>maxdiff){
                        maxdiff=difference;
                        break;
                }
            }
            if(A.get(lastptr)<A.get(firstptr)){
                lastptr--;
            }
        }

        return maxdiff;
    }


    public static void DutchProblem(int []arr){
        int end=arr.length-1;
        int start=0;
        int mid=0;
        int pivot=1;
        while(mid<=end){
            if(arr[mid]<pivot){
                swap(arr,mid,start);
                start++;
                mid++;
            }
            else if(arr[mid]>pivot){
                swap(arr,mid,end);
                end--;
            }
            else{
                mid++;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void swap(int []arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

    static public int totalNoways(char[] digits,int n){

        if(n==0 || n==1){
            return 1;
        }

        int count=0;
        if(digits[n-1]>'0')
            count=totalNoways(digits,n-1);

        if(digits[n-2]=='1'||(digits[n-2]=='2' && digits[n-1]<'7'))
        count=count+totalNoways(digits,n-2);
        return count;
    }


    public static String  LongestPalindrome(String palindrome){
        String longest=" ";

        for(int i=0;i<palindrome.length()-1;i++){

            String findLongest=findLongestPalindrome(palindrome,i,i);
            if(findLongest.length()>longest.length()){
                longest=findLongest;
            }
            String findLongesteven=findLongestPalindrome(palindrome,i,i);
            if(findLongesteven.length()>longest.length()){
                longest=findLongesteven;
            }
        }
        return longest;
    }
    public static String findLongestPalindrome(String palindrome,int left,int right){
        int length=palindrome.length();

        while(left>=0 && right<length && palindrome.charAt(left)==palindrome.charAt(right)){
            left--;
            right++;
        }
        return palindrome.substring(left+1,right);
    }
}
