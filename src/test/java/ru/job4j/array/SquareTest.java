package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SquareTest {
    @Test
    public void whenBound4Than0149() {
        int[] rsl = Square.calculate(4);
        int[] expected = {0, 1, 4, 9};
        assertThat(rsl).contains(expected);
    }
}