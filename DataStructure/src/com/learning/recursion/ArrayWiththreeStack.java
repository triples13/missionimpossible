package com.learning.recursion;

public class ArrayWiththreeStack {

    ArrayWiththreeStack(int size) {
        this.size=size;
        stackarray=new int[size];
        this.toptwo=size;
        basethree=size/2;
        topthree=size/2;
        topone=-1;
    }
    private int []stackarray;
    private int size;
    private int topone=-1;
    private int toptwo;
    private int topthree=size/2;
    private int basethree=size/2;


    public void push (int stackid,int data) throws  Exception
    {
        if(stackid==1){
            if(topone+1==basethree){
                if(isstack3isrightshiftable()){
                    shiftstack3toright();
                    stackarray[++topone]=data;
                }
                else{
                    throw new Exception("stack 1 is overflow");
                }

            }
            stackarray[++topone]=data;
        }
        else if(stackid==2){
            if(toptwo-1==topthree){
                if(isstack3leftshifatble()){
                    shiftstack3toleft();
                    stackarray[--toptwo]=data;
                }
                else{
                    throw new Exception("stack 2 is overflow");
                }
            }
            stackarray[--toptwo]=data;
        }
        else if(stackid==3){
            if(topthree==toptwo-1){
                if(isstack3leftshifatble()){
                    shiftstack3toleft();
                    stackarray[++topthree]=data;
                }
                else{
                    throw new Exception("stack 3 is overflow");
                }
            }
            stackarray[++topthree]=data;
        }
    }

    public int pop(int stackid) throws Exception{
        int getdata=0;
        if(stackid==1){
            if(topone==-1){
                throw new Exception("stack 1 is is empty");
            }
            getdata=stackarray[topone];
            topone--;

        }
        else if(stackid==2){
            if(toptwo==size){
                throw new Exception("stack 2 is empty");
            }
            getdata=stackarray[toptwo];
            toptwo++;

        }
        else if(stackid==3){
            if(topthree==size){
                throw new Exception("stack 3 is empty");
            }
            getdata=stackarray[topthree];
        }

        return getdata;
    }



    public boolean isstack3isrightshiftable(){
        if(topthree+1<toptwo){
            return true;
        }
        return false;
    }

    public boolean isstack3leftshifatble(){
        if(basethree>topthree+1){
            return true;
        }
        return false;
    }
    public void shiftstack3toright(){

        for(int i=topthree+1;i>=basethree+1;i--){
            stackarray[i]=stackarray[i-1];
        }
        stackarray[basethree]=0;
        topthree++;
        basethree++;

    }
    public void shiftstack3toleft(){
        for(int i=basethree-1;i<=topthree-1;i++){
            stackarray[i]=stackarray[i+1];
        }
        stackarray[topthree]=0;
        topthree--;
        basethree--;
    }
    }

