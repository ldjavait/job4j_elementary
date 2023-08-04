package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MathCalculatorTest {
    @Test
    public void whenSumPlusMultiply10to10Than120() {
        byte first = 10;
        byte second = 10;
        short expected = (short) MathCalculator.sumPlusMultiply(first, second);
        short result = 120;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMinusPlusDivide10to10Than1() {
        byte first = 10;
        byte second = 10;
        short expected = (short) MathCalculator.minusPlusDivide(first, second);
        short result = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenPlusAll10to10Than121() {
        byte first = 10;
        byte second = 10;
        short expected = (short) MathCalculator.plusAll(first, second);
        short result = 121;
        assertThat(result).isEqualTo(expected);
    }
}