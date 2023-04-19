package org.example.lessonFive;

public class Test {
    public static void main(String[] args) {
        Cat<String, Integer> cat = new Cat("Шпуня", 1, "Кошка", "Тыгыдык тыгыдык", 3);
        Dog<String, Integer> dog = new Dog("Филимон", 2, "Собака", "Ррррррр гав", "Вжжжжжжж");

        System.out.println(cat.returnAge13Result.checkAges(62));
        System.out.println(dog.discriminantCalculate.returnDiscriminant(4.4, 6.9, 1.7));
    }
}