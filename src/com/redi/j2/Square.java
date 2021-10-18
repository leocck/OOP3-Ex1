package com.redi.j2;

public class Square extends Shape{

    private double sideLength;

    public Square(double sideLength) {
        super("Square", Math.pow(sideLength, 2), sideLength*4);
        this.sideLength = sideLength;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Side Length: "+sideLength);
        System.out.println("======================");
    }
}
