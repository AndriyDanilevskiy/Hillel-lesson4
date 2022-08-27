package com.andriy.danilevskyy.hillel.service;

import com.andriy.danilevskyy.hillel.models.Cat;
import com.andriy.danilevskyy.hillel.models.Dog;

public class Run {
    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik");
        murzik.run(200);
        murzik.swim(1);

        Cat barsik = new Cat("Barsik");
        barsik.run(100);
        barsik.swim(1);

        Dog sharik = new Dog("Sharik");
        sharik.run(400);
        sharik.swim(9);

        Dog bobik = new Dog("Bobik");
        bobik.run(500);
        bobik.swim(10);
    }
}
