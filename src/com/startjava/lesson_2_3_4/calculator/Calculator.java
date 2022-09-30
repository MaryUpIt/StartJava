package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int number1;
    private static int number2;
    private static char mathOperator;

    private static void parseExpression(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        if (partsExpression.length != 3) {
            throw new IllegalArgumentException("Ошибка ввода, Неверное количество элементов уравнения!");
        }
        try {
            number1 = Integer.parseInt(partsExpression[0]);
            number2 = Integer.parseInt(partsExpression[2]);
        } catch (NumberFormatException exp) {
            throw new NumberFormatException("Ошибка ввода, вводите только целые числа!");
        }
        mathOperator = partsExpression[1].charAt(0);
    }

    public static int calculate(String mathExpression) {
        parseExpression(mathExpression);
        if (number2 == 0 && (mathOperator == '%' || mathOperator == '/')) {
            throw new ArithmeticException("Ошибка ввода. Делить на ноль нельзя!!!");
        }
        return switch (mathOperator) {
            case '+' -> Math.addExact(number1, number2);
            case '-' -> Math.subtractExact(number1, number2);
            case '*' -> Math.multiplyExact(number1, number2);
            case '/' -> Math.floorDiv(number1, number2);
            case '%' -> Math.floorMod(number1, number2);
            case '^' -> (int) Math.pow(number1, number2);
            default -> throw new IllegalArgumentException("Ошибка ввода. Неверный знак операции!");
        };
    }
}
