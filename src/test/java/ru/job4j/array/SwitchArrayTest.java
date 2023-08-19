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
}