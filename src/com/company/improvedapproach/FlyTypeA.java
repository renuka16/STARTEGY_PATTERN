package com.company.improvedapproach;

public class FlyTypeA implements FlyBehaviour{
    //You can re-use this fly method when and where required.
    @Override
    public void fly() {
        System.out.println("This is flying method of type 'A'");
    }
}
