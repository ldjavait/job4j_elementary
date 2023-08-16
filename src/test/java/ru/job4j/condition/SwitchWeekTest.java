package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchWeekTest {
    @Test
    public void when1ThenMonday() {
        String rsl = "Понедельник";
        String expected = SwitchWeek.nameOfDay(1);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void when11ThanMistake() {
        String rsl = "Ошибка";
        String expected = SwitchWeek.nameOfDay(11);
        assertThat(rsl).isEqualTo(expected);
    }
}