package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TrgAreaTest {
    @Test
    public void when2to2to2Than1dot73() {
        byte a = 2;
        byte b = 2;
        byte c = 2;
        double expected = 1.73;
        double result = TrgArea.area(a, b, c);
        assertThat(result).isEqualTo(expected, offset(0.01));
    }
}