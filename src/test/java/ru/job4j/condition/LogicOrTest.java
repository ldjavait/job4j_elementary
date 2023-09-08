package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LogicOrTest {
    @Test
    public void whenNumNegativeOrOddThanTrue() {
        boolean rsl = LogicOr.check(-23);
        assertThat(rsl).isTrue();
    }
}