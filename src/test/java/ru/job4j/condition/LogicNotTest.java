package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LogicNotTest {
    @Test
    public void whenIsEven() {
        byte num = 8;
        boolean rsl = LogicNot.isEven(num);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenIsPositive() {
        byte num = 1;
        boolean rsl = LogicNot.isPositive(num);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenNotEven() {
        byte num = 9;
        boolean rsl = LogicNot.notEven(num);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenNotPositive() {
        byte num = -1;
        boolean rsl = LogicNot.notPositive(num);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenNotEvenAndPositive() {
        byte num = 9;
        boolean rsl = LogicNot.notEvenAndPositive(num);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenEvenOrNotPositive() {
        byte num = -3;
        boolean rsl = LogicNot.evenOrNotPositive(num);
        assertThat(rsl).isTrue();
    }
}