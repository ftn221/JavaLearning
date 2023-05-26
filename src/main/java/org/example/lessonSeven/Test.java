package org.example.lessonSeven;

import java.util.ArrayList;
import java.util.List;
import org.example.lessonSix.Student;

public class Test {
    public static List<org.example.lessonSix.Student> students = new ArrayList<>();
    public static List<org.example.lessonSix.Student> badStudents = new ArrayList<>();

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

            students.add(new org.example.lessonSix.Student("Студент " + (x + 1), group, course, estimates));
        }

        //удаляем плохих студентов
        removeBadStudent();
        //повышаем курс хорошим студентам
        upgradeStudents();
        //выводим студентов с нужным курсом
        printStudents(students, 4);
    }

    public static void removeBadStudent() {
        //создаем массив студентов не проходящих по среднему баллу меньше 3-х
        for (org.example.lessonSix.Student student : students) {
            if (student.getMiddleEstimation() <= 3.0) {
                badStudents.add(student);
            }
        }

        //удаляем плохих студентов из основного массива студентов
        students.removeAll(badStudents);
    }

    public static void upgradeStudents() {
        students.stream().forEach(org.example.lessonSix.Student::upgradeCourse);
    }

    public static void printStudents(List<org.example.lessonSix.Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " " + "учится на курсе: " + student.getCourse());
                System.out.println("Средний балл: " + student.getMiddleEstimation());
            }
        }
    }
}
