package org.example.lessonSix;

import java.util.ArrayList;

public class Student {
    private String name;
    private int group;
    private int course;
    private ArrayList<Integer> estimates;

    public Student(String name, int group, int course, ArrayList<Integer> estimates) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.estimates = estimates;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public ArrayList<Integer> getEstimates() {
        return estimates;
    }

    public void upgradeCourse() {
        this.course++;
    }
}