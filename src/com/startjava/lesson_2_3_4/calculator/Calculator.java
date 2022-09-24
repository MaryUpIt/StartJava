package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private char mathOperator;
    public Calculator (String mathExpression)
    {
        String[] arrMathExpression = mathExpression.split(" ");
        number1 = Integer.parseInt(arrMathExpression[0]);
        mathOperator = arrMathExpression[1].charAt(0);
        number2 = Integer.parseInt(arrMathExpression[2]);
    }
      public int calculate() {
        switch (mathOperator) {
            case '+':
                return Math.addExact(number1, number2);
            case '-':
                return Math.subtractExact(number1, number2);
            case '*':
                return Math.multiplyExact(number1, number2);
            case'/':
                if (number2 == 0) {
                    System.out.println("Ошибка: на ноль делить нельзя!");
                    break;
                }
                return Math.floorDiv(number1, number2);
            case '%':
                if (number2 == 0) {
                    System.out.println("Ошибка: на ноль делить нельзя!");
                    break;
                }
                return Math.floorMod(number1, number2);
            case '^':
                return (int) Math.pow(number1, number2);
            default:
                System.out.println("Ошибка: знак операции неверный!");
        }
        return 0;
    }
}
