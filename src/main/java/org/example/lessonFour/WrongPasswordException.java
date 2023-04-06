package org.example.lessonFour;

public class WrongPasswordException extends Exception {
    public WrongPasswordException (String description) {
        super(description);
    }
}
