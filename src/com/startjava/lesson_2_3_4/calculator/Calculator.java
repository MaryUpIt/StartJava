package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    public Calculator (int a, int b, char sign)
    {
        this.a = a;
        this.b =b;
        this.sign = sign;
    }

    public int result() {
        int result = 0;
        switch(sign) {
        case '+':
            result = a + b;
            break;
        case '-':
            result = a - b;
            break;
        case '*':
            result = a * b;
            break;
        case '/':
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Ошибка: делить на ноль нельзя!");
            }
            break;
        case '%':
            if (b != 0) {
                result = a % b;
            } else {
                System.out.println("Ошибка: делить на ноль нельзя!");
            }
            break;
        case '^':
            result = 1 ;
            while (b >= 1) {
                result *= a;
                b--;
            }
            break;
        default:
            System.out.println("Ошибка: знак операции неверный!");
        }
        return result;
    }
}
