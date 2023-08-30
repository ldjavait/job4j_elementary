package ru.job4j.obj;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

public class Task1Test {
    @Test
    public void whenCreateTask1() {
        var task = new Task1();
        MatcherAssert.assertThat(task, is(notNullValue()));
    }
}