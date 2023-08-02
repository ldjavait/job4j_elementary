package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return  value / 101;
    }

    public static float rubleToDollar(float value) {
        return  value / 92;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rub are " + euro + " euro");
        float dollar = rubleToDollar(140);
        System.out.println("140 rub are " + dollar + " dollar");
    }
}
