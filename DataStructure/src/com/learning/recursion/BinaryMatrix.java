package com.learning.recursion;

public class BinaryMatrix {
    public static void main(String []args){
        int [][]twoDmatrix={{1,0,1},{1,1,1},{1,1,1}};
        System.out.println("matrix is binary:"+searchResult(twoDmatrix));
         int []a,b;
         int c[],d;

         int num =(int)50L;
         long y=(byte) 50;
         byte z=(byte) 50L;
         byte x=(byte)50L;
    }


    public static boolean searchResult(int [][]twoDmatrix){
        boolean searchResult=true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(!(twoDmatrix[i][j]==0 || twoDmatrix[i][j]==1)){
                    searchResult=false;
                }
            }
        }

        return searchResult;
    }
}
