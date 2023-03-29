package org.example.lessonThree;

public class Dog extends Animal implements MakeVoice {

    private String voiceExample;
    private String runType;

    public Dog(String name, int id, String type, String voiceExample, String runType) {
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
}
