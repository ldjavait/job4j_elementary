package ru.job4j.obj;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

public class Task3Test {
    @Test
    public void whenCreateTask3() {
        var task = new Task3();
        MatcherAssert.assertThat(task, is(notNullValue()));
    }

    @Test
    public void whenCheckVariable() {
        var task = new Task3();
        int x = task.x;
        MatcherAssert.assertThat(task, is(notNullValue()));
    }

    @Test
    public void whenMethodInvoke() {
        var task = new Task3();
        int x = task.getX();
        MatcherAssert.assertThat(x, is(3));
    }
}