package ru.job4j.converter;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ConverterTest {
    @Test
    public void when140RubThen1dot38Euro() {
        float in = 140;
        float expected = 1.38f;
        float out = Converter.rubleToEuro(in);
        assertThat(out).isEqualTo(expected, offset(0.01f));
    }

    @Test
    public void when140RubThen1dot52fDollar() {
        float in = 140;
        float expected = 1.52f;
        float out = Converter.rubleToDollar(in);
        assertThat(out).isEqualTo(expected, offset(0.01f));
    }

    @Test
    public void when0RubThan0Euro() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToEuro(in);
        assertThat(out).isEqualTo(expected);
    }
}