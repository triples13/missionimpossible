package com.learning.recursion;

import java.io.FileNotFoundException;
import java.io.IOException;

class animal{

}
class buffalo extends  animal{

}

public class MehtodOveriding  {

    Double a=new Double(20);
    public animal methodOver() throws FileNotFoundException {
       return  new animal();
    }
}


class  hello extends MehtodOveriding{
    //Double b=new Double(20);
    public buffalo methodOver()  {
       return new buffalo();
    }
}
