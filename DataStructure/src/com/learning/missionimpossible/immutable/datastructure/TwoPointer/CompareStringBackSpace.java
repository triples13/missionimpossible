package com.learning.missionimpossible.immutable.datastructure.TwoPointer;

public class CompareStringBackSpace {

    public static void main(String [] args){

        String s1 = "xp#";
        String s2 ="xyz##";


        System.out.println("two strings are equal:"+compareTwoString(s1,s2));
    }

    public static boolean compareTwoString(String s1,String s2){

        int index1 = s1.length()-1;
        int index2 = s2.length()-1;

        while(index1>=0 && index2>=0){

          index1=  getNextValidIndex(s1,index1);
          index2 = getNextValidIndex(s2,index2);

          if(index1<=0 && index2<=0)
              return true;
          if(index1<0 || index2<0)
              return false;
          if(s1.charAt(index1)!=s2.charAt(index2))
              return false;


          index1= index1-1;
          index2 = index2-1;
        }

        return  false;
    }


    public static  int getNextValidIndex(String s1, int index){

        int backSpace = 0;

        while (index>=0){

            if(s1.charAt(index)=='#')
                backSpace++;
            else if(backSpace>0)
                backSpace--;
            else
                break;;

           index--;
        }

        return  index;
    }

}
