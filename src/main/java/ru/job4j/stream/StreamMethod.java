package ru.job4j.stream;

import java.util.Collection;
import java.util.stream.Stream;

/**
 * Создайте стрим из переданной коллекции
 */
public class StreamMethod {
    public static Stream<Integer> createStream(Collection<Integer> data) {
        return data.stream();
    }
}
