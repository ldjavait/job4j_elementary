package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LogicAndTest {
    @Test
    public void whenNumPositiveAndEvenThanTrue() {
        boolean rsl = LogicAnd.check(24);
        assertThat(rsl).isTrue();
    }
}