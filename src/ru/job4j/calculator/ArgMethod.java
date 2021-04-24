package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    //не знаю насколько правильно. Но перенная age как бы намекает на перегрузку)
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + " age " + age);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        ArgMethod.hello(name);
        ArgMethod.hello(name, age);
    }
}
