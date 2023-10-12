package ru.job4j.stream;

import java.util.stream.Stream;

/**
 * Создайте стрим из символов 'a', 'b', 'c'
 */
public class StreamOfMethod {
    public static Stream<Character> createStream() {
        return Stream.of('a', 'b', 'c');
    }
}
