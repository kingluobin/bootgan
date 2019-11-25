package com.agan.boot.animal;

import com.agan.boot.IShout;

public class Cat implements IShout {
    @Override
    public void shout() {
        System.out.println("miao miao");
    }
}
