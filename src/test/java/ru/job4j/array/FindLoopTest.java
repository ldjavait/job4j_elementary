package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int result = FindLoop.indexOf(data, 5);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{5, 11, 3};
        int rsl = FindLoop.indexOf(data, 10);
        int expected = -1;
        assertThat(rsl).isEqualTo(expected);
    }
}