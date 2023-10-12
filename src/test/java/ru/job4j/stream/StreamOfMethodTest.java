package ru.job4j.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

class StreamOfMethodTest {
    @Test
    public void whenUserStreamMethod() {
        Assertions.assertEquals("abc", StreamOfMethod.createStream()
                .map(Object::toString)
                .collect(Collectors.joining()));
    }
}