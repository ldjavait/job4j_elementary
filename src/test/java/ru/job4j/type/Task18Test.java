package ru.job4j.type;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Task18Test {
    @Test
    public void when1and2and3Than3210() {
        int rsl = Task18.capSum(1, 2, 3);
        int expected = 3210;
        assertThat(rsl).isEqualTo(expected);
    }
}