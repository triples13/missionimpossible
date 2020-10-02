package com.learning.missionimpossible.immutable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TestClass {

    static Integer [] [] memorize;

        static int solve(int N, int M){


            if(N==M )
                return 0;

            if (memorize[N][M]!=null)
                return memorize[N][M];


            int minimumCost=Integer.MAX_VALUE;

            List<Integer> myList = findEvenDivisor(N);

            if(myList.size()==0)
                return -1;

            for(int i=0;i<myList.size();i++){

                if(N+myList.get(i)<=M) {
                    int currentCost = N/myList.get(i);

                  //  if(memorize [myList.get(i)/2-1][myList.get(i)]!=null)
                      //  return memorize [myList.get(i)/2-1][myList.get(i)];

                    memorize[N][M] = Math.min(minimumCost, currentCost + solve(N + myList.get(i), M));

                    //    memorize[myList.get(i)/2-1][myList.get(i)] = minimumCost;


                }
            }

            return memorize[N][M];

        }

        public static List<Integer> findEvenDivisor(int n){

            int x=1;
            List<Integer> myList = new ArrayList();
            for(;x<n;x++){
                if(n%x ==0 && x%2==0)
                    myList.add(x);
            }

            return myList;
        }

    public static List<Integer> findAllEvenDivisor(int n){

        int x=1;
        List<Integer> myList = new ArrayList();
        for(;x<n;x++){
            if(x%2==0)
                myList.add(x);
        }

        return myList;
    }


        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter wr = new PrintWriter(System.out);
            int T = Integer.parseInt(br.readLine().trim());
            for(int t_i = 0; t_i < T; t_i++)
            {
                String[] line = br.readLine().split(" ");
                int N = Integer.parseInt(line[0]);
                int M = Integer.parseInt(line[1]);

                memorize = new Integer [M][M+1];

                int out_ = solve(N, M);

                System.out.println(out_);

            }

            wr.close();
            br.close();

        }





    }

