package ru.job4j.calculator;

public class Fit {
    public static double manWeight(float height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(float height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(183);
        System.out.println("Man 183 is " + man);
        double woman = womanWeight(165);
        System.out.println("Woman 165 is " + woman);
    }
}
