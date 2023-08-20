package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MinDiapasonTest {

    @Test
    void whenLastMin() {
        int[] array = new int[]{1, 4, 77, 3, 67, 13, -65};
        int expected = -65;
        int rsl = MinDiapason.findMin(array, 4, 6);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenFirstMin() {
        int[] array = new int[]{1, 4, 77, 3, 67, 13, -65};
        int expected = 1;
        int rsl = MinDiapason.findMin(array, 0, 5);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMiddleMin() {
        int[] array = new int[]{3, 4, 77, 1, 67, 13, 100};
        int expected = 1;
        int rsl = MinDiapason.findMin(array, 0, 5);
        assertThat(rsl).isEqualTo(expected);
    }
}