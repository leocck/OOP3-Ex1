package com.redi.j2;

import java.util.ArrayList;

public class RediList<E> extends ArrayList<E> {


    public int count(E elementToCheckInside) {
        int counter = 0;

        // do some verification
        for (int i = 0; i < this.size(); i++){
            E currentElement = this.get(i);
            if (currentElement.equals(elementToCheckInside)) {
                counter++;
            }
        }

        return counter;
    }
}
