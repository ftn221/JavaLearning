package org.example.lessonOne;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        int weight = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            if (weight < 450) {
                int peopleWeight = sc.nextInt();
                if (weight + peopleWeight > 450) {
                    System.out.println("Вы не можете зайти в лифт, превышается вес, пусть зайдет кто то менее упитанный");
                    System.out.println("На данный момент количество людей в лифте: " + weight);
                    i--;
                    continue;
                }
                weight += peopleWeight;
            }
            else {
                break;
            }

            System.out.println("Общий вес людей в лифте: " + weight);
        }
    }
}
