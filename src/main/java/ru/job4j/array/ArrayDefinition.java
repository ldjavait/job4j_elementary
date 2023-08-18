package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        String[] name = new String[4];
        name[0] = "Denis Lazykin";
        name[1] = "Anastasiya Lazykina";
        name[2] = "Artem Lazykin";
        name[3] = "Andrey Lazykin";
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
    }
}
