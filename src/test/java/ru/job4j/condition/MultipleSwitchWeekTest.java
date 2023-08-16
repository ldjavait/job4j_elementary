package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MultipleSwitchWeekTest {
@Test
    public void when1ThanMonday() {
    int expected = MultipleSwitchWeek.numberOfDay("Monday");
    int rsl = 1;
    assertThat(rsl).isEqualTo(expected);
}

    @Test
    public void when11ThanMistake() {
        int expected = MultipleSwitchWeek.numberOfDay("Вторница");
        int rsl = -1;
        assertThat(rsl).isEqualTo(expected);
    }
}