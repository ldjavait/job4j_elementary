package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PointEqTest {
    @Test
    public void whenEquals() {
        boolean rsl = PointEq.eq(1, 1, 1, 1);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenNotEquals() {
        boolean rsl = PointEq.eq(1, 11, 111, 1111);
        assertThat(rsl).isFalse();
    }
}