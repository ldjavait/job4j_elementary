package ru.job4j.stream;

import java.util.stream.Stream;

/**
 * Ваша задача создать стрим из первого и последнего элементов массива
 */
public class StreamBuilder {
    public static Stream<Object> createStream(Integer[] data) {
        return Stream.builder()
                .add(data[0])
                .add(data[data.length - 1])
                .build();
    }
}
