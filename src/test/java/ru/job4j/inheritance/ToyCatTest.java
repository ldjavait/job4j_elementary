package ru.job4j.inheritance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ToyCatTest {
    @Test
    public void whenCanBeOk() {
        ToyCat toyCat = new ToyCat();
        boolean rsl = toyCat.canBeWashMachine();
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenCatPurrOk() {
        ToyCat toyCat = new ToyCat();
        boolean rsl = toyCat.catPurr();
        assertThat(rsl).isTrue();
    }
}