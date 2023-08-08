package ru.job4j.io;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Task21Test {
    @Test
    public void shouldOutputFullNameAndPhoneInFrame() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.main(null);
        String expected = "***************************" + System.lineSeparator()
                + "* Лазыкин Денис Андреевич *" + System.lineSeparator()
                + "*    +7(926) 888-23-28    *" + System.lineSeparator()
                + "***************************";
        assertThat(out.toString(), is(expected));
    }
}