package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 101;
    }

    public static float rubleToDollar(float value) {
        return value / 92;
    }

    public static void main(String[] args) {
        float inRub = 140;
        float expectedEuro = 1.3861386f;
        float outEuro = Converter.rubleToEuro(inRub);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 1.3861386. Test result : " + passedEuro);
        float expectedDollar = 1.5217391f;
        float outDollar = Converter.rubleToDollar(inRub);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 1.5217391. Test result : " + passedDollar);
    }
}
