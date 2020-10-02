package com.learning.missionimpossible.immutable.DesignPattern.solidprinciple.singleresponsibility.structural.adapter.facade;

public class FacadeTest  {

    private Rectangle rectangle;
    private Square square;
    private Triangle triangle;


    public Rectangle drawRectangle(){
        return  new Rectangle();
    }

    public Square drawSquare(){
        return  new Square();
    }
    public Triangle drawTriangle(){
        return new Triangle();
    }
}
