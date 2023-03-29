package org.example.lessonOne;

public class TaskTwo {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            //отсеиваем все числа не заканчивающиеся на ноль от 100 до 1000 т.е. все трехзначные
            if (i % 10 == 0) {
                int sum = 0;
                for (int x = 0; x < i; x++) {
                    if (x % 2 != 0) {
                        sum += x;
                    }
                }
                if (sum % 10 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}