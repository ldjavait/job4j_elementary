package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LessThenTest {
    @Test
    public void whenTrue() {
        assertThat(LessThen.check(1, 2)).isTrue();
    }

    @Test
    public void whenFalse() {
        assertThat(LessThen.check(2, 1)).isFalse();
    }
}