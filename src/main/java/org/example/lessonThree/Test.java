package org.example.lessonThree;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Шпуня", 1, "Кошка", "Тыгыдык тыгыдык", 3);
        Dog dog = new Dog("Филимон", 2, "Собака", "Ррррррр гав", "Вжжжжжжж");

        cat.sayName();
        cat.sayId();
        cat.showInfo();
        cat.sayAge();
        cat.run();
        cat.byeBye();

        dog.sayName();
        dog.sayId();
        dog.makeVoice();
        dog.run();
    }
}
