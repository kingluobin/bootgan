package com.agan.boot.animal;

import com.agan.boot.IShout;

public class Dog implements IShout {
    @Override
    public void shout() {
        System.out.println("wang wang");
    }
}
