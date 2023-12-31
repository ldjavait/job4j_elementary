package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    public void when00to20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double result = a.distance(b);
        assertThat(result).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when12to34Then2dot82() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double expected = 2.82;
        double result = a.distance(b);
        assertThat(result).isEqualTo(expected, offset(0.01));
    }

    @Test
    void when123to456Than5dot19() {
        Point one = new Point(1, 2, 3);
        Point two = new Point(4, 5, 6);
        double expected = 5.19;
        double rsl = one.distance3d(two);
        assertThat(rsl).isEqualTo(expected, offset(0.01));
    }
}