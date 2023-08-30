package ru.job4j.obj;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

public class FooTest {
@Test
    public void whenCreate() {
    var task = new Foo();
    MatcherAssert.assertThat(task, is(notNullValue()));
}
}