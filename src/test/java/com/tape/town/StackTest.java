package com.tape.town;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private final Stack stack = new Stack();

    @Test
    public void push() throws CloneNotSupportedException {
        stack.push(new PhoneNumber(111, 222, 4444));

        Stack cloned = stack.clone();


        System.out.println(stack.pop());
        System.out.println(cloned.pop());
    }
}
