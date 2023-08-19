package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl = true;
        for (boolean i : data) {
            if (data[0] != i) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
