package com.learning.interview.battleship;

import java.util.HashSet;
import java.util.Set;

public class Board {

    int s1=2;//large
    int s2=2;//medium
    int s3=1;//small

    int board [][];
    Set<Cordinates> cordinatesSet;

    Board(int x,int y){
        this.board = new int [x][y];
        cordinatesSet= new HashSet<>();
    }

    public void placeShip(Ship ship,int x,int y, Orientation orientation){


        Set<Cordinates> temp = new HashSet<>();
        switch (ship){

            case Large:
                if(s1==0)
                    throw  new IllegalArgumentException("no ships is there");

                Cordinates cordinates = new Cordinates(x,y);
                if(cordinatesSet.contains(cordinates))
                    throw new IllegalArgumentException("ship already placed in the position");
                else{

                    if(orientation==Orientation.horizontal)
                    {
                        if(x+5>19)
                            throw  new IllegalArgumentException("cannt place ship");

                        for(int i=0;i<5;i++){
                            Cordinates cord = new Cordinates(x+i,y);
                            temp.add(cord);
                        }

                        cordinatesSet.addAll(temp);
                        temp.clear();
                    }
                    else{

                        if(y+5>19)
                            throw  new IllegalArgumentException("cannt place ship");

                        for(int i=0;i<5;i++){
                            Cordinates cord = new Cordinates(x,y+i);
                            temp.add(cord);
                        }

                        cordinatesSet.addAll(temp);
                        temp.clear();
                    }
                }

            case Medium:

            case Small:


        }

    }


    public boolean bombard(int x,int y,Player player){

        Cordinates cordinates = new Cordinates(x,y);
        if(board[x][y]==1)
            return  true;

        board[x][y]=1;

        cordinatesSet.remove(cordinates);

        if(cordinatesSet.size()==0) {
            System.out.println("game over");
            return true;
        }

        return  false;
    }
}
