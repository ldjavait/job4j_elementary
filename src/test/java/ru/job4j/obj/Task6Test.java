package ru.job4j.obj;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

public class Task6Test {
    @Test
    public void whenCheckVariable() {
        var task = new Task6();
        int x = task.getAge();
        MatcherAssert.assertThat(x, is(20));
    }

    @Test
    public void whenCheckConstructor() {
        var task = new Task6("name", "surname");
        MatcherAssert.assertThat(task, is(notNullValue()));
    }
}