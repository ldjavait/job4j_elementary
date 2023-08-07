package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DummyBotTest {
    @Test
    public void whenGreetBot() {
        String in = "Hi, bot.";
        String rsl = DummyBot.answer(in);
        String expected = "Hi, SmartAss.";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenByeBot() {
        String in = "Bye.";
        String rsl = DummyBot.answer(in);
        String expected = "See you later.";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenUnknownBot() {
        String in = "How are you?";
        String rsl = DummyBot.answer(in);
        String expected = "I don't know. Please, ask another question.";
        assertThat(rsl).isEqualTo(expected);
    }
}