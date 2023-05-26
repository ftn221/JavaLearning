package org.example.lessonSeven;

import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private List<Integer> estimates;

    public Student(String name, int group, int course, List<Integer> estimates) {
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

    public List<Integer> getEstimates() {
        return estimates;
    }

    public void upgradeCourse() {
        this.course++;
    }

    public double getMiddleEstimation() {
        return estimates.stream().mapToInt(value -> value).average().orElse(-1);
    }
}
