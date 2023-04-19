package org.example.lessonFive;

public class Cat<T, S> extends Animal implements ShowInfo<T> {

    private T runType;
    private static int age;

    public Cat(T name, S id, T type, T runType, int age) {
        super(name, id, type);
        this.runType = runType;
        Cat.age = age;
    }

    public static void sayAge() {
        System.out.println("Сколько лет уже живу на свете: ");
        for (int i = 0; i <= age; i++) {
            System.out.println(i);
        }
        System.out.println("Целых " + age + " !");
    }

    @Override
    public void run() {
        System.out.println("Я бегаю как: " + runType);
    }

    @Override
    public T showInfo(T message) {
        System.out.println(message);
        return message;
    }

    MyCheckAges<Integer> returnAge13Result = age -> (age % 13) == 0;
}