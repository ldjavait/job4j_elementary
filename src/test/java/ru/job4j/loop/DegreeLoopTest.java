package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DegreeLoopTest {
    @Test
    public void whenA2N7Than128() {
        int rsl = DegreeLoop.calculate(2, 7);
        int expected = 128;
        assertThat(rsl).isEqualTo(expected);
    }
}