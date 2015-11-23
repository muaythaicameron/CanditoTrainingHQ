package com.example.cameron.canditotraininghq;

/**
 * Created by Cameron on 8/10/2015.
 */
public class Person {

    String fName;
    String lName;
    double bench;
    double benchGoal;
    double squat;
    double squatGoal;
    double deadlift;
    double deadliftGoal;
    double height;
    double weight;
    int age;


    public Person(String fName_in, String lName_in, double bench_in, double benchGoal_in, double squat_in, double squatGoal_in, double deadlift_in,
                              double deadliftGoal_in, double height_in, double weight_in, int age_in) {
            fName = fName_in;
            lName = lName_in;
            bench = bench_in;
            benchGoal = benchGoal_in;
            squat = squat_in;
            squatGoal = squatGoal_in;
            deadlift = deadlift_in;
            deadliftGoal = deadliftGoal_in;
            height = height_in;
            weight = weight_in;
            age = age_in;
    }
}