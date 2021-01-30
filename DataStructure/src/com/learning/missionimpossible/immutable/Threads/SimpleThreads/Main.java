package com.learning.missionimpossible.immutable.Threads.SimpleThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
        static List<String> result;
        public static void Peaks(int N, int A[]) {
                //int result=-404;
                //write your Logic here:
                result = new ArrayList<>();
                
                for(int i=0;i<N;i++){
                    formPeaks(A[i],A[i],"");
                    System.out.println(result.size());
                }
                
             
        }
        
        public static void formPeaks(int open,int closed,String word){
            

            if(open==0 && closed>=0){
                while(closed!=0){
                    word = word+")";
                    closed--;
                }

            }

            if(open==0 && closed==0)
            {
                // count++;

                result.add(word);

                return;
            }


            if(open<closed)
               formPeaks(open,closed-1,word+")");
             
            formPeaks(open-1,closed,word+"(");   
        }
        public static void main(String[] args) {
                // INPUT [uncomment & modify if required]
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int A [] = new int[N];
                for(int i=0; i<N; i++) {
                                A[i] = sc.nextInt();
                }
                // OUTPUT [uncomment & modify if required]
                Peaks(N,A);
                sc.close();
        }
}