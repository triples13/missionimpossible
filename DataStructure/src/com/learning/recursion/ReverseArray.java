package com.learning.recursion;

public class ReverseArray {

    public static void main(String []args){
        int []arr={1,2,3,4,5,6,7};
        rotateArray(arr,2,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

        int[] arr1={12,14,18,21,3,6,8,9};
        System.out.println(findElement(arr1,10,0,arr1.length-1));
        findSum(arr1,93);
       int maximumSum= findMaximumSum(arr1);
        System.out.println("maxium sum is :"+maximumSum);
        findMinimumElement(arr1,0,arr1.length-1);
    }

    public static boolean findElement(int []arr,int key,int start,int end){
        int mid;
        boolean found=false;
        mid=(start+end)/2;
        if(arr[mid]==key){
            return true;
        }

        if(arr[mid]>arr[start]){
            if(key>=arr[start] &&key<arr[mid]){
               found= findElement(arr,key,start,mid-1);
            }
            else{
               found= findElement(arr,key,mid+1,end);
            }
        }

        if(arr[end]<arr[mid]){
            if(key<=arr[end] && key>mid){
              found=  findElement(arr,key,mid+1,end);
            }
            else{
               found= findElement(arr, key, start, mid-1);
            }
        }
        return found;
    }
    public static void rotateArray(int []arr,int d,int length){


        leftrotateArray(arr,0,d-1);
        leftrotateArray(arr,d,arr.length-1);
        leftrotateArray(arr,0,arr.length-1);
    }

    private static void leftrotateArray(int[] arr, int start, int end) {
        int temp;
        while(start<end){
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }

    public static void findSum(int []arr,int sum)
    {

        int pos=0;
        int length=arr.length;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                pos=i;
                System.out.println("pos:"+pos);
                break;
            }

        }

        int l=pos;
        int r=pos+1;

        while(l!=r){

            if(arr[l]+arr[r]==sum){
                System.out.println("element 1 is :"+arr[l]+","+"element 2 is :"+arr[r]);
                System.out.println("if");
                return;
            }
            else if(arr[l]+arr[r]>sum){
                System.out.println("else");
                l=(length+l-1)%length;
            }
            else if(arr[l]+arr[r]<sum){
                System.out.println("if else");
                r=(r+1)%length;
            }
            else{
                System.out.println("sum is not found");
            }
        }
    }

    public static int  findMaximumSum(int []arr){

        int maximum=Integer.MIN_VALUE;
        int maxpos=0;
        int length=arr.length;
        int maximumSum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
                maxpos=i;
            }
        }

        int d=arr.length-maxpos-1;
        int [] newarr=rotateMyArray(arr ,d,0,arr.length-1);

        for(int i=0;i<newarr.length;++i){
            maximumSum+=newarr[i]*i;
        }

        return maximumSum;
    }

    public static  int[] rotateMyArray(int []arr,int distance,int start,int end){

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }


        leftrotateMyArray(arr,distance,0,distance-1);
        leftrotateMyArray(arr,distance,distance,end);
        leftrotateMyArray(arr,distance,0,end);

        return arr;


    }

    private static int [] leftrotateMyArray(int[] arr, int distance,int start, int end) {
        int temp;
        while(start<end){
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        return arr;
    }


    private static void findMinimumElement(int []arr, int start,int end){
        int mid=(start+end)/2;
        if(arr[mid]<arr[end]){
            if(arr[mid-1]>arr[mid] && arr[mid]<arr[mid+1]){

                System.out.println("minium element"+arr[mid]);
                return;
            }
            else{
                findMinimumElement(arr,0,mid-1);
            }
        }
        else if(arr[mid]>arr[start]){
            if(arr[mid-1]>arr[mid] && arr[mid]<arr[mid+1]){

                System.out.println("minium element"+arr[mid]);
            }
            else{
                findMinimumElement(arr,mid+1,end);
            }
        }

    }
}
