package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EvenCheckTest {
    @Test
    public void whenFalse() {
        assertThat(EvenCheck.check(3)).isFalse();
    }

    @Test
    public void whenTrue() {
        assertThat(EvenCheck.check(2)).isTrue();
    }
}