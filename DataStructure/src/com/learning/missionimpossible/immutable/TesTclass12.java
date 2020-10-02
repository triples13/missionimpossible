package com.learning.missionimpossible.immutable;

class A1 {
    public int i;
    protected int j;
}

class B2 extends A1 {
    int j;

    void display() {
        super.j = 3;
        super.i = 10;
        System.out.println(i + " " + j);
    }
}
public class TesTclass12 {
    public void doIt(int i , Men p){
        i = 5;
        p.number = 8;
    }

    public static void main(String args[]){


        long out = findBigNO(6);
        System.out.println(out);
    }

    public static long findBigNO(long n){
        long ans= (long) Math.pow(10,9)+7;

        StringBuilder sb = new StringBuilder();

        for(int i=1;i<=n;i++){

            sb.append(findBinary(i));
        }


        long x =  getDecimal(sb.toString());

        return x%ans;
    }

    public static String findBinary(int x){

        StringBuilder sb = new StringBuilder();
        int index = 0;

        while(x>0){
            sb.append(x%2);
            x= x/2;
        }

       return sb.reverse().toString();
    }

    public static long getDecimal(String s){

        long x =Long.valueOf(s);

        long result = 0;

        long temp = x;

        long base =1;

        while(temp>0){

            long lastDigit = temp%10;
            temp=temp/10;
            result = result + lastDigit*base;
            base = base*2;
        }

        return result;
    }
}
class Men {
    public int number;
}
