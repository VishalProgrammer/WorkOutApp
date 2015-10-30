package com.hfad.workoutapp;

public class Workout {
    public String name;
    public String description;


    public static final Workout[] workouts = {
            new Workout("The limb loosner", "WE WILL WE WILL ROCK YOU"),
            new Workout("Core Agony", "SHADOW OF THE DAY"),
            new Workout("The Wimp Special", "LIKE IT AS YOU ARE"),
            new Workout("Strength and Length", "Always loved you")
    };

    private Workout(String name,String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return this.name;
    }
}
