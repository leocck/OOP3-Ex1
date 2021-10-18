package com.redi.j2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//	    Shape shape = new Shape("Irregular Form", 20.5, 50);
//        shape.print();
//
//        Shape shape2 = new Square(10);
//        shape2.print();

        RediList<Integer> myList = new RediList();
        myList.add(5);
        myList.add(2);
        myList.add(5);
        myList.add(4);
        myList.add(10);
        myList.add(5);
        myList.add(3);

        System.out.println(myList.toString());
        System.out.println(myList.count(20));
    }
}
