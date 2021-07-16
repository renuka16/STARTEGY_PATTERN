package com.company.naiveapproach;

public class Duck3 extends Duck{
    public Duck3(String name) {
        super(name);
    }

    //Where is the code re-usability for this method which is same in Duck1 and Duck3
    //Imagine there are 20 such methods, you have track all of them and do any changes if required at
    //all the places.
    @Override
    public void fly() {
        System.out.println("This is flying method of type 'A'");
    }
}
