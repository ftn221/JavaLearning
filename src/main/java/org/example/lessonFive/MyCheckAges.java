package org.example.lessonFive;

@FunctionalInterface
public interface MyCheckAges<T> {
    boolean checkAges(T t);
}