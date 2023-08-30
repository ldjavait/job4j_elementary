package ru.job4j.obj;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

class Task2Test {
    @Test
    public void whenCreateTask2() {
        var task = new Task2();
        MatcherAssert.assertThat(task, is(notNullValue()));
    }

    @Test
    public void whenCheckVariable() {
        var task = new Task2();
        int x = task.x;
        MatcherAssert.assertThat(task, is(notNullValue()));
    }
}