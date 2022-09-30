package com.startjava.lesson_2_3_4.calculator;

import com.startjava.lesson_2_3_4.calculatorCopy.CalculatorCopy;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (!answer.equals("no")) {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = scanner.nextLine();
            try {
                System.out.println(mathExpression + " = " + CalculatorCopy.calculate(mathExpression));
            } catch (RuntimeException exp) {
                System.out.println(exp);
            }
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}