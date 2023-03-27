package org.example.lessonTwo;

import java.util.Scanner;

public class TaskTwo {

    static Scanner sc = new Scanner(System.in);
    private static int natural = sc.nextInt();
    private static int count = 1;
    public static void main(String[] args) {
        counter();
    }

    public static void counter() {
        if (count <= natural) {
            System.out.println(count);
            count++;
            counter();
        }
        else {
            System.out.println("Расчет окончен!");
        }
    }
}
