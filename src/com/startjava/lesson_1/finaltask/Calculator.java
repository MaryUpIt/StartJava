package com.startjava.lesson_1.finaltask;

public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        char sign = '^';
        int b = 1;
        int result = 0;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Делить на ноль нельзя!");
            }
        } else if (sign == '%') {
            if (b != 0) {
                result = a % b;
            } else {
                System.out.println("Делить на ноль нельзя!");
            }
        } else if (sign == '^') {
            result = 1;
            int tmp = b;
            while (tmp >= 1) {
                result *= a;
                tmp--;
            }
        } else {
            System.out.println("Неверный знак операции!");
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}