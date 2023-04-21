package org.example.lessonSix;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<Student> students = new ArrayList<>();
    public static List<Student> badStudents = new ArrayList<>();

    public static void main(String[] args) {

        //заполняем массив студентами
        for (int x = 0; x < 200; x++) {
            //создаем рандомное значение группы
            int group = ((int) (Math.random() * 10)) + 1;
            //создаем рандомное значение курса
            int course = ((int) (Math.random() * 10)) + 1;

            //инициализируем массив оценок для каждого студента
            ArrayList<Integer> estimates = new ArrayList<>();

            //заполняем массив estimates случайными оценками от 0 до 5
            for (int i = 0; i < 11; i++) {
                int estimate = (int) (Math.random() * 6);
                estimates.add(estimate);
            }

            students.add(new Student("Студент " + (x + 1), group, course, estimates));
        }

        //удаляем плохих студентов
        removeBadStudent();
        //повышаем курс хорошим студентам
        upgradeStudents();
        //выводим студентов с нужным курсом
        printStudents(students, 4);
    }

    //расчет средней оценки
    public static double middleEstimation(ArrayList<Integer> estimates) {
        double estimationSum = 0;
        double middleEstimation = 0;

        for (int estimate : estimates) {
            estimationSum += estimate;
        }

        middleEstimation = estimationSum / estimates.size();

        return middleEstimation;
    }

    public static void removeBadStudent() {
        //создаем массив студентов не проходящих по среднему баллу меньше 3-х
        for (Student student : students) {
            if (middleEstimation(student.getEstimates()) <= 3.0) {
                badStudents.add(student);
            }
        }

        //удаляем плохих студентов из основного массива студентов
        students.removeAll(badStudents);
    }

    public static void upgradeStudents() {
        for (Student student : students) {
            student.upgradeCourse();
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " " + "учится на курсе: " + student.getCourse());
            }
        }
    }
}
