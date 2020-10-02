package com.learning.missionimpossible.immutable.datastructure.array.binarysearch;

public class findInMatrix {

    public static void main(String [] args){

        int [] [] toFind = {{10,11,12,13},{14,15,16,17},{27,29,30,31},{32,33,39,80}};

        int start = 0;
        int end = toFind[0].length-1;

        int key =91;

        findSimpleSolution(toFind,key);

        int low = 0;
        int high = toFind.length-1;

        while(low<=high){

            int mid = (low+high)/2;

            if(key>=toFind[mid][0] && key<=toFind[mid][end]){
                System.out.println("key exist:"+findKey(toFind,mid,end,key));
                break;
            }

            else if( key>toFind[mid][end]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        System.out.println("key doent exist");
    }

    public static boolean findKey(int [][] arr,int start, int end,int key) {


        int low =0;
        int high = end;
        while(low<=high){

            int mid = (low+high)/2;

            if(arr[start][mid]==key)
                return true;

            else if (arr[start][mid]>key)
                 high =mid-1;
            else
                low=mid+1;
        }

        return false;
    }

    public static void findSimpleSolution(int [][] arr,int key){

        int j=0;
        int i=arr.length-1;

        while(i>=0 && j<=arr[0].length-1){

            if(arr[i][j]==key) {
                System.out.println("key exist");
                break;
            }
            else if(key>arr[i][j])
                j++;
            else if(key<arr[i][j])
                i--;

        }
        System.out.println("key doesnt exist");
    }


}
