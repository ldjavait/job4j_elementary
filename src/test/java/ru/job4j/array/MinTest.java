package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[]{99, 100, 199};
        int expected = 99;
        int rsl = Min.findMin(array);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[]{99, 100, 90};
        int expected = 90;
        int rsl = Min.findMin(array);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[]{99, 80, 199};
        int expected = 80;
        int rsl = Min.findMin(array);
        assertThat(rsl).isEqualTo(expected);
    }
}