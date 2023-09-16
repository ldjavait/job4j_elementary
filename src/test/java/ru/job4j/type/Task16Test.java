package ru.job4j.type;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task16Test {
    @Test
    public void when6Than5and4and3() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Task16.decreaseBy2(6);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator()).add("5").add("4").add("3");
        assertThat(outputStream.toString(), is(expected.toString()));
    }
}