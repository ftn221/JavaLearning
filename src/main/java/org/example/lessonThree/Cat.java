package org.example.lessonThree;

public class Cat extends Animal implements ShowInfo {

    private String runType;
    private static int age;
    public Cat(String name, int id, String type, String runType, int age) {
        super(name, id, type);
        this.runType = runType;
        Cat.age = age;
    }

    public static void sayAge() {
        System.out.println("Сколько лет уже живу на свете: ");
        for (int i = 0; i<= age; i++) {
            System.out.println(i);
        }
        System.out.println("Целых " + age + " !");
    }

    @Override
    public void run() {
        System.out.println("Я бегаю как: " + runType);
    }

    @Override
    public void showInfo() {
        System.out.println("Добрые люди подобрали меня на улице");
    }
}
