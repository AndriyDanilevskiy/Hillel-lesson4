package com.andriy.danilevskyy.hillel.models;


import static com.andriy.danilevskyy.hillel.service.Validator.isDistanceValid;

public class Cat extends Animal {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        int runDistLimit = 200;
        if (isDistanceValid(distance, runDistLimit)) {
            System.out.println(name + " has ran " + distance + " meters.");
        } else {
            System.out.println(name + " can't run " + runDistLimit + " meters or more.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " can't swim.");
    }
}


