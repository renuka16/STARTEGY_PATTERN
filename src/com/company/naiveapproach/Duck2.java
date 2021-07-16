package com.company.naiveapproach;

public class Duck2 extends Duck{

    public Duck2(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("This is flying method of type 'B'");
    }
}
