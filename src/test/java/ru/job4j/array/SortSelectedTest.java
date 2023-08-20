package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {
    @Test
    void whenSort5num() {
        int[] array = new int[]{3, 4, 1, 2, 5};
        int[] rsl = SortSelected.sort(array);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    void whenSort3num() {
        int[] array = new int[]{3, 4, 1};
        int[] rsl = SortSelected.sort(array);
        int[] expected = new int[]{1, 3, 4};
        assertThat(rsl).containsExactly(expected);
    }
}