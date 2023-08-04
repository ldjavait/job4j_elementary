package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MathFuncTest {
    @Test
    public void when2Than5() {
        byte number = 2;
        int expected = MathFunc.func1(number);
        double result = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when2Than0() {
        byte number = 2;
        int expected = MathFunc.func2(number);
        double result = 0;
        assertThat(result).isEqualTo(expected);
    }
}