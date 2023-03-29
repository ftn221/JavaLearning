package org.example.lessonThree;

public class Cat extends Animal implements ShowInfo {

    private String runType;
    private int age;
    public Cat(String name, int id, String type, String runType, int age) {
        super(name, id, type);
        this.runType = runType;
        this.age = age;
    }

    public void sayAge() {
        System.out.println("Мне уже " + age + " годика");
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
