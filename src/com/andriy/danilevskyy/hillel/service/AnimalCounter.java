package com.andriy.danilevskyy.hillel.service;

public class AnimalCounter {
    private static int animalAmount = 0;
    private static int catAmount = 0;
    private static int dogAmount = 0;

    public static void addCat(){
        animalAmount++;
        catAmount++;
    }

    public static void addDog(){
        animalAmount++;
        dogAmount++;
    }

    public static int getAnimalAmount(){
        return animalAmount;
    }

    public static int getCatAmount(){
        return catAmount;
    }

    public static int getDogAmount() {
        return dogAmount;
    }
}
