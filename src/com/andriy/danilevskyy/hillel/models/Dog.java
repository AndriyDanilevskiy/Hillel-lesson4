package com.andriy.danilevskyy.hillel.models;

import static com.andriy.danilevskyy.hillel.service.Validator.isDistanceValid;

public class Dog extends Animal {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        int runDistLimit = 500;
        if (isDistanceValid(distance, runDistLimit)) {
            System.out.println(name + " has ran " + distance + " meters.");
        } else {
            System.out.println(name + " can't run " + runDistLimit + " meters or more.");
        }
    }

    @Override
    public void swim(int distance) {
        int swimDistLimit = 10;
        if (isDistanceValid(distance, swimDistLimit)) {
            System.out.println(name + " has swum " + distance + " meters.");
        } else {
            System.out.println(name + " can't swim " + swimDistLimit + " meters or more.");
        }
    }

}
