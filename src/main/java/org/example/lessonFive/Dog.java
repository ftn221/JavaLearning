package org.example.lessonFive;

public class Dog<T, S> extends Animal implements MakeVoice {

    private T voiceExample;
    private T runType;

    public Dog(T name, S id, T type, T voiceExample, T runType) {
        super(name, id, type);
        this.voiceExample = voiceExample;
        this.runType = runType;
    }

    @Override
    public void run() {
        System.out.println("Я бегаю как: " + runType);
    }

    @Override
    public void makeVoice() {
        if (voiceExample.equals("Ррррррр гав")) {
            System.out.println("Я подаю голос как: " + voiceExample);
        } else {
            System.out.println("По моему ты ошибся классом, друг.");
        }
    }

    DiscriminantInterface<Double> discriminantCalculate = (a, b, c) -> ((Math.pow(b, 2)) - (4 * a * c));
}