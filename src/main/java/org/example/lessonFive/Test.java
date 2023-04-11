package org.example.lessonFive;

public class Test {
    public static void main(String[] args) {
        Cat <String, Integer> cat = new Cat("Шпуня", 1, "Кошка", "Тыгыдык тыгыдык", 3);
        Dog <String, Integer> dog = new Dog("Филимон", 2, "Собака", "Ррррррр гав", "Вжжжжжжж");

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
