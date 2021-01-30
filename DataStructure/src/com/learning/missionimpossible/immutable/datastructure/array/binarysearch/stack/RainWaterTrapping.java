package com.learning.missionimpossible.immutable.datastructure.array.binarysearch.stack;

public class RainWaterTrapping {
    public static void main(String [] args){


        System.out.println("maximum water trapped:"+trap(new int []{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap(int [] height){
        if(height==null || height.length==0)
            return 0;

        int [] left = new int [height.length];
        int [] right = new int [height.length];


        left[0]= height[0];

        for(int i=1;i<left.length;i++)
            left[i]=Math.max(left[i-1],height[i]);

        right[height.length-1]=height[height.length-1];

        for(int j=height.length-2;j>=0;j--)
            right[j]=Math.max(right[j+1],height[j]);

        int sum=0;

        for(int i=0;i<height.length;i++ )
            sum=sum+ (Math.min(left[i],right[i])-height[i]);

        return sum;
    }
}
