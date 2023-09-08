package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class OddCheckTest {
    @Test
    public void whenNumOddThanTrue() {
        boolean rsl = OddCheck.check(3);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenNumEvenThanFalse() {
        boolean rsl = OddCheck.check(2);
        assertThat(rsl).isFalse();
    }
}