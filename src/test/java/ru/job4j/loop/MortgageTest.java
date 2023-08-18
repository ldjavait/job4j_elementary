package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MortgageTest {
    @Test
    void whenAmount1000Salary1200Percent1ThenYear1() {
        int result = Mortgage.year(1000, 1200, 1);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount100Salary120Percent50ThenYear2() {
        int result = Mortgage.year(100, 120, 50);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount1000Salary1200Percent20ThenYear1() {
        int result = Mortgage.year(1000, 1200, 20);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount100Salary100Percent50ThenYear4() {
        int result = Mortgage.year(100, 70, 50);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}