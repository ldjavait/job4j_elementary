package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TriangleTest {
    @Test
    public void whenExist() {
        boolean rsl = Triangle.exist(5.0, 5.0, 5.0);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenNotExist() {
        boolean rsl = Triangle.exist(15.0, 555.0, 55.0);
        assertThat(rsl).isFalse();
    }
}