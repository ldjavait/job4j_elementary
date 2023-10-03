package ru.job4j.obj;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Задание: Объявить класс Task11, в нём объявить очередь deque (поле).
 * Реализацией очереди должен быть LinkedList<Integer>.
 * Добавить метод init(),
 * в котором выполнить добавление значений 1, 2, 3
 * последовательно в начало очереди с помощью одного из методов вставки в начало.
 */
public class Task11 {
    static Deque<Integer> deque = new LinkedList<>();

    public static Deque<Integer> init() {
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        return deque;
    }
}
