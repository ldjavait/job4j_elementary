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

    @Test
    void whenFirst1Second2Third3ThanThird() {
        byte first = 1;
        byte second = 2;
        byte third = 3;
        int rsl = Max.max(Max.max(first, second), third);
        assertThat(rsl).isEqualTo(third);
    }

    @Test
    void whenFirst3Second1Third2ThanFirst() {
        byte first = 3;
        byte second = 1;
        byte third = 2;
        int rsl = Max.max(Max.max(first, second), third);
        assertThat(rsl).isEqualTo(first);
    }

    @Test
    void whenFirst2Second3Third1ThanSecond() {
        byte first = 2;
        byte second = 3;
        byte third = 1;
        int rsl = Max.max(Max.max(first, second), third);
        assertThat(rsl).isEqualTo(second);
    }

    @Test
    void whenFirst4Second3Third2Fourth1ThanFirst() {
        byte first = 4;
        byte second = 3;
        byte third = 2;
        byte fourth = 1;
        int rsl = Max.max(Max.max(first, second), Max.max(third, fourth));
        assertThat(rsl).isEqualTo(first);
    }

    @Test
    void whenFirst3Second4Third1Fourth2ThanSecond() {
        byte first = 3;
        byte second = 4;
        byte third = 1;
        byte fourth = 2;
        int rsl = Max.max(Max.max(first, second), Max.max(third, fourth));
        assertThat(rsl).isEqualTo(second);
    }

    @Test
    void whenFirst2Second1Third4Fourth3ThanThird() {
        byte first = 2;
        byte second = 1;
        byte third = 4;
        byte fourth = 3;
        int rsl = Max.max(Max.max(first, second), Max.max(third, fourth));
        assertThat(rsl).isEqualTo(third);
    }

    @Test
    void whenFirst1Second2Third3Fourth4ThanFourth() {
        byte first = 1;
        byte second = 2;
        byte third = 3;
        byte fourth = 4;
        int rsl = Max.max(Max.max(first, second), Max.max(third, fourth));
        assertThat(rsl).isEqualTo(fourth);
    }

    @Test
    void whenThirdParameters() {
        byte first = 1;
        byte second = 2;
        byte third = 3;
        int rsl = Max.max(first, second, third);
        assertThat(rsl).isEqualTo(third);
    }

    @Test
    void whenFourParameters() {
        byte first = 1;
        byte second = 2;
        byte third = 3;
        byte fourth = 4;
        int rsl = Max.max(first, second, third, fourth);
        assertThat(rsl).isEqualTo(fourth);
    }
}