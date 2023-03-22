package org.example;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        int weight = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 6; i++) {
            if (weight > 450) {
                System.out.println("Превышен допустимый вес - пошел вон из лифта");
                break;
            }
            else if (i == 6) {
                System.out.println("В лифте находится максимальное количество людей");
                break;
            }
            int peopleWeight = sc.nextInt();
            weight += peopleWeight;
            System.out.println("Общий вес людей в лифте: " + weight);
        }
    }
}
