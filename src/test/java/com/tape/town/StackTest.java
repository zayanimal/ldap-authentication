package com.tape.town;

import org.junit.jupiter.api.Test;

class StackTest {
    private final Stack<PhoneNumber> stack = new Stack<>();

    @Test
    public void push() throws CloneNotSupportedException {
        stack.push(new PhoneNumber(111, 222, 4444));

        var cloned = stack.clone();

        System.out.println(stack.pop());
        System.out.println(cloned.pop());
    }
}
