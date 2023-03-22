package org.example;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer num = sc.nextInt();

        if (num > 500) {
            String result = String.valueOf(num);
            System.out.println(String.valueOf(result.charAt(1)) + String.valueOf(result.charAt(0)) + String.valueOf(result.charAt(2)));
        }
        else {
            String result = String.valueOf(num);
            System.out.println(String.valueOf(result.charAt(0)) + String.valueOf(result.charAt(2)) + String.valueOf(result.charAt(1)));
        }
    }
}
