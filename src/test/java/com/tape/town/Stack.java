package com.tape.town;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> implements Cloneable {
    private T[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
        this.elements = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(T e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        T result = elements[--size];
        elements[size] = null;

        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    @Override
    public Stack<T> clone() throws CloneNotSupportedException {
        @SuppressWarnings("unchecked") Stack<T> result = (Stack<T>) super.clone();
        result.elements = elements.clone();

        return result;
    }
}
