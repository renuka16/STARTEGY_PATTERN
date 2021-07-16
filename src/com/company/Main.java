package com.company;

import com.company.improvedapproach.Duck;
import com.company.improvedapproach.Duck1;
import com.company.improvedapproach.FlyTypeA;
import com.company.improvedapproach.FlyTypeB;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck duck1 = new Duck1("Coopy");
        duck1.setFlyBehaviour(new FlyTypeA());
        duck1.performFly();

//        Duck duck2 = new Duck2("Buddy");
//        duck2.setFlyBehaviour(new FlyTypeB());
//        duck2.performFly();
    }
}
