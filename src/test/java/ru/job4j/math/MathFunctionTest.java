package ru.job4j.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MathFunctionTest {
@Test
    public void when12Sum12Than24() {
    byte first = 12;
    byte second = 12;
    byte expected = 24;
    double result = MathFunction.sum(first, second);
    assertThat(result).isEqualTo(expected);
}

    @Test
    public void when12Multiply12Than144() {
        byte first = 12;
        byte second = 12;
        short expected = 144;
        double result = MathFunction.multiply(first, second);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when12Minus12Than0() {
        byte first = 12;
        byte second = 12;
        byte expected = 0;
        double result = MathFunction.minus(first, second);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when12Divide12Than1() {
        byte first = 12;
        byte second = 12;
        byte expected = 1;
        double result = MathFunction.divide(first, second);
        assertThat(result).isEqualTo(expected);
    }
}