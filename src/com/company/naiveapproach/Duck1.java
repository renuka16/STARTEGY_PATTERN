package com.company.naiveapproach;

public class Duck1 extends Duck{

    public Duck1(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("This is the flying method of type 'A'");
    }
}
