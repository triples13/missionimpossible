package com.learning.interview.battleship;

public class Cordinates  implements  Comparable<Cordinates>{

    private int x;
    private int y;


    Cordinates(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    @Override
    public int compareTo(Cordinates o) {
        if(this.x==o.x && this.y==o.y)
            return 0;
        return 1;
    }
}
