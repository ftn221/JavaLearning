package org.example.lessonThree;

public abstract class Animal {

    protected String name;
    protected int id;
    protected String type;

    public Animal(String name, int id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }

    public void sayName() {
        System.out.println("Мое имя: " + name);
        System.out.println("Моя порода: " + type);
    }

    public void sayId () {
        System.out.println("Мой порядковый номер: " + id);
    }

    public void byeBye () {
        System.out.println("До свидания!!!");
        System.out.println();
    }

    public abstract void run ();
}
