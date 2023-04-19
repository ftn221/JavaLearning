package org.example.lessonFive;

public abstract class Animal<T, S> {

    protected T name;
    protected S id;
    protected T type;

    public Animal(T name, S id, T type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }

    public void sayName() {
        System.out.println("Мое имя: " + name);
        System.out.println("Моя порода: " + type);
    }

    public void sayId() {
        System.out.println("Мой порядковый номер: " + id);
    }

    public void byeBye() {
        System.out.println("До свидания!!!");
        System.out.println();
    }

    public abstract void run();
}
