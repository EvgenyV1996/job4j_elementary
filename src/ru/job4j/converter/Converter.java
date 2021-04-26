package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int inDollar = 180;
        int exceptedDollar = 3;
        int inEuro = 140;
        int exceptedEuro = 2;

        int euro = Converter.rubleToEuro(inEuro);
        int dollar = Converter.rubleToDollar(inDollar);

        boolean passedDollar = exceptedDollar == dollar;
        boolean passedEuro = exceptedEuro == euro;

        System.out.println("180 rubles are 3 dollar. Test result : " + passedDollar);
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
    }
}
