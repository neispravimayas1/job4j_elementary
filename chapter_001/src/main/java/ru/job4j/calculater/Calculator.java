package ru.job4j.calculater;
public class Calculator {

    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }
    public static void div(double first, double second) {
        double division=  first / second;
        System.out.println(first + "/" + second + " = " + division);
            }
    public static void multiply(double first, double second) {
        double multiply =  first * second;
        System.out.println(first + "*" + second + " = " + multiply);
    }
    public static void subtrack(double first, double second) {
        double subtrack =  first - second;
        System.out.println(first + "-" + second + " = " + subtrack);
    }
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply (2, 1);
        subtrack (10, 5);

    }
}

