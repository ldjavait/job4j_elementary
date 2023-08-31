package ru.job4j.inheritance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CatTest {
    @Test
    public void whenOk() {
        Cat cat = new Cat();
        boolean rsl = cat.catPurr();
        assertThat(rsl).isTrue();
    }
}