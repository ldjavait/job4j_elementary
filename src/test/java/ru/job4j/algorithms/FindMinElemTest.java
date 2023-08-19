package ru.job4j.algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindMinElemTest {
    @Test
    void whenFindMin() {
        int[] array = new int[]{12, 65, 3, 76, 31, 56, 90, 44, 2};
        int expected = 2;
        int rsl = FindMinElem.min(array);
        assertThat(rsl).isEqualTo(expected);
    }
}