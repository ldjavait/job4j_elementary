package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {
    @Test
    public void whenLeftGreaterThanRight() {
        byte left = 47;
        byte right = 23;
        int rsl = Max.max(left, right);
        byte expected = 47;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenRightGreaterThanLeft() {
        byte left = 23;
        byte right = 47;
        int rsl = Max.max(left, right);
        byte expected = 47;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenRightEqualsLeft() {
        byte left = 47;
        byte right = 47;
        int rsl = Max.max(left, right);
        byte expected = 47;
        assertThat(rsl).isEqualTo(expected);
    }
}