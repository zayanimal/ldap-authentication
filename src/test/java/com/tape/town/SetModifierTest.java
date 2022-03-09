package com.tape.town;

import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.function.UnaryOperator;

import static com.tape.town.SetModifier.union;

class SetModifierTest {
    private static final UnaryOperator<Object> identity = (t) -> t + " ";

    @Test
    public void identityTest() {
        UnaryOperator<String> identityFn = identityFunction();
        UnaryOperator<String> identityFn2 = (t) -> t + "Hello";

        String res = identityFn.compose(identityFn2).apply("Vasya");
        System.out.println(res);
    }

    private static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) identity;
    }

    @Test
    public void unionTest() {
        Set<String> guys = Set.of("Tom", "Dick", "Harry");
        Set<String> stooges = Set.of("Larry", "Moe", "Curly");
        Set<String> aflCio = union(guys, stooges);

        System.out.println(aflCio);
    }
}