package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DivideBySixTest {
    @Test
    void whenNumberDivideBy6() {
        String result = DivideBySix.checkNumber(24);
        String expected = "The number divides by 6.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberDivideBy3AndNotEven() {
        String result = DivideBySix.checkNumber(9);
        String expected = "The number divides by 3, but it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberNoDivideBy3AndEven() {
        String result = DivideBySix.checkNumber(14);
        String expected = "The number doesn't divide by 3, but it is the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberNoDivideBy3AndNotEven() {
        String result = DivideBySix.checkNumber(25);
        String expected = "The number doesn't divide by 3 and it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }
}