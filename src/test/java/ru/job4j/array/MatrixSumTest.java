package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixSumTest {
    @Test
    void whenSingle() {
        int[][] array = {{10}};
        int rsl = MatrixSum.sum(array);
        int expected = 10;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenTwo() {
        int[][] array = {{1, 2}, {3, 4}};
        int rsl = MatrixSum.sum(array);
        int expected = 10;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenThree() {
        int[][] array = {{1, 2, 5}, {3, 4, 6}};
        int rsl = MatrixSum.sum(array);
        int expected = 21;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMix() {
        int[][] array = {
                {1, 2},
                {3, 4, 6},
                {7, 8, 9, 11},
                {47},
                {56, 34, 23, 11, 12}};
        int rsl = MatrixSum.sum(array);
        int expected = 234;
        assertThat(rsl).isEqualTo(expected);
    }
}