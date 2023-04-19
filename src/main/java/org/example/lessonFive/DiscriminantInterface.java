package org.example.lessonFive;

@FunctionalInterface
public interface DiscriminantInterface<T> {
    Double returnDiscriminant(T a, T b, T c);
}