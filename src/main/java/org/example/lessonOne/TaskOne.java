package org.example.lessonOne;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer num = sc.nextInt();

        int first = (num - (num % 100)) / 100;
        int middle = ((num % 100) - (num % 10)) / 10;
        int last = num % 10;

        if (num > 500) {
            int res = (last * 100) + (middle * 10) + first;
            System.out.println(res);
        }
        else {
            int res = (first * 100) + (last * 10) + middle;
            System.out.println(res);
        }
    }
}
