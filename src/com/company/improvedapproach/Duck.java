package com.company.improvedapproach;

public class Duck {
    private final String name;
    FlyBehaviour flyBehaviour;

    public Duck(String name) {
        this.name = name;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void swim(com.company.naiveapproach.Duck duck){
        System.out.println("I'm swimming");
    }

    public void display(){
        System.out.println("Hey, I am the duck. You can see me now");
    }


    // Instead of marking the fly as abstract method, you separate it out and
    // create a flyBehaviour interface. Create classes which implement this interface
    // which typically represent all types of flying behaviours

    // Weird point: You actually making a behaviour turn into a class, is that valid?
    // Ex: a flying behavior might have instance variables representing the attributes for
    // the flying (wing beats per minute, max altitude, and speed, etc.) behavior.

    public void performFly(){
        flyBehaviour.fly();
    }
}
