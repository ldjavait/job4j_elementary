package ru.job4j.stream;

import java.util.stream.Stream;

/**
 * Вам нужно заполнить Stream.iterate так что обход был начиная с 0, причем обходился бы только каждый второй элемент.
 * <p>
 * Например, для {1, 2, 3, 4} вывод должен быть 1 и 3
 */
public class StreamIterate {
    public static void showArray(Integer[] data) {
        Stream.iterate(0, i -> i < data.length, i -> i + 2)
                .forEach(i -> System.out.println(data[i]));
    }
}
