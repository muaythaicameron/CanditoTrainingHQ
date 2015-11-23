package com.example.cameron.canditotraininghq;

/**
 * Created by Cameron on 11/22/2015.
 */
public class Exercise {
    String type;
    double weight;
    int reps;
    int minReps;

    //Generic constructor for Exercise class. An exercise can be Bench, Squat, Deadlift, or accessory
    public Exercise(String type_in, double weight_in, int reps_in, int minReps_in) {
        type = type_in;
        weight = weight_in;
        reps = reps_in;
        minReps = minReps_in;
    }

}