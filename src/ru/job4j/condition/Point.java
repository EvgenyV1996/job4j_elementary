package ru.job4j.condition;
import java.util.Scanner;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {

        Scanner znach = new Scanner(System.in);

        System.out.println("Введите x1");
        int x1 = znach.nextInt();
        System.out.println("Введите x2");
        int x2 = znach.nextInt();
        System.out.println("Введите y1");
        int y1 = znach.nextInt();
        System.out.println("Введите y2");
        int y2 = znach.nextInt();

       // double result = Point.distance(0, 0, 2, 0);
        double result = Point.distance(x1, y1, x2, y2);
        String strResult = String.format("result (%s, %s) to (%s, %s) %s", x1, y1, x2, y2, result);
       // System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println(strResult);

    }
}
