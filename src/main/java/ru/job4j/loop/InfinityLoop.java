package ru.job4j.loop;

public class InfinityLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Infinity");
            i -= 1;
        }
    }
}
