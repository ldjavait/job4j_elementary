package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    public void when00to20Then2() {
        byte x1 = 0;
        byte y1 = 0;
        byte x2 = 2;
        byte y2 = 0;
        double expected = 2;
        double result = Point.distance(x1, y1, x2, y2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when12to34Then2dot82() {
        byte x1 = 1;
        byte y1 = 2;
        byte x2 = 3;
        byte y2 = 4;
        double expected = 2.82;
        double result = Point.distance(x1, y1, x2, y2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}