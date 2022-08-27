package com.andriy.danilevskyy.hillel.service;

public class Validator {

    public static boolean isDistanceValid(int distance, int distanceLimit) {
        return distance < distanceLimit;
    }
}
