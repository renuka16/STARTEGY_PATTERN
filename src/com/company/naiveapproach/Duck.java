package com.company.naiveapproach;

public abstract class Duck {
    private final String name;

    public Duck(String name) {
        this.name = name;
    }

    public void swim(Duck duck){
        System.out.println("I'm swimming");
    }

    public void display(){
        System.out.println("Hey, I am the duck. You can see me now");
    }

    /*
    Problem 1
     Not all ducks can fly.
      so, make it abstract and let the sub-classes deal with it.
      public void fly(){
           System.out.println("Look I am flying.");
        }
    */

    public abstract void fly();

}
