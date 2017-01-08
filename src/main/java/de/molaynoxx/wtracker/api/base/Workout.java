package de.molaynoxx.wtracker.api.base;

import de.molaynoxx.wtracker.api.storage.Storable;

import java.util.ArrayList;

/**
 * A workout can contain many different ExerciseSets
 */
public class Workout implements Storable {

    private final ArrayList<ExerciseSet> exercises = new ArrayList<>();
    /**
     * needs to be a valid filename (no invalid characters)
     */
    private String name;

    /**
     * Creates a new workout
     * @param name name of the new workout, needs to be needs to be a valid filename (no invalid characters)
     */
    public Workout(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the workout
     * @return name of the workout
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the workout
     * @param name name of the workout
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a list of the ExerciseSets contained within this workout
     * @return a list of the ExerciseSets contained within this workout
     */
    public ArrayList<ExerciseSet> getExercises() {
        return exercises;
    }

    @Override
    public String getSubPath() {
        return "Workouts/";
    }

    @Override
    public String getFileName() {
        return name + ".json";
    }

}