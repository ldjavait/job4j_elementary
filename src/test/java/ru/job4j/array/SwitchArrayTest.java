package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {
    @Test
    void whenFirst1Last6ThanFirst6Last1() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = SwitchArray.swapBoarder(array);
        int[] expected = new int[]{6, 2, 3, 4, 5, 1};
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    void whenSwap0to3() {
        int[] array = {1, 2, 3, 4};
        int source = 0;
        int dest = array.length - 1;
        int[] result = SwitchArray.swap(array, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to6() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] rsl = SwitchArray.swap(array, 3, 6);
        int[] expected = {1, 2, 3, 7, 5, 6, 4, 8, 9};
        assertThat(rsl).containsExactly(expected);
    }
}