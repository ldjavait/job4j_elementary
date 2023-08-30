package ru.job4j.obj;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Task5Test {
    @Test
    public void whenCreateTask5() {
        Class<Task5> task = Task5.class;
        assertTrue(task.isRecord());
    }
}