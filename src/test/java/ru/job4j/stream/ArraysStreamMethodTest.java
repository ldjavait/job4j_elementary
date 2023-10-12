package ru.job4j.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArraysStreamMethodTest {
    @Test
    public void test() {
        Integer[] data = {1, 2, 3};
        Assertions.assertEquals(3, ArraysStreamMethod.createStream(data)
                .count());
    }
}