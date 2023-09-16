package ru.job4j.type;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Task15Test {
    @Test
    public void when8Than10and12and14() {
        String expected = "10, 12, 14";
        assertThat(Task15.increaseBy2(8)).isEqualTo(expected);
    }
}