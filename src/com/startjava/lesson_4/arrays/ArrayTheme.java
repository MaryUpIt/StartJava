package com.startjava.lesson_4.arrays;

import java.util.SplittableRandom;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numArray = {4, 2, 5, 7, 1, 3, 6};
        System.out.print("Исходный массив: ");
        for (int number : numArray) {
            System.out.print(number + " ");
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < numArray.length; i++) {
                if (numArray[i] > numArray[i - 1]) {
                    isSorted = false;
                    int tmp = numArray[i];
                    numArray[i] = numArray[i - 1];
                    numArray[i - 1] = tmp;
                }
            }
        }
        System.out.print("\nОтсортированный массив от большего к меньшему: ");
        for (int number : numArray) {
            System.out.print(number + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        numArray = new int[]{2, 3, 0, 9, 6, 1, 4, 8, 5, 7};
        String index = "";
        String result = "Результат произведения элементов массива: ";
        int multiply = 1;
        for (int i = 0; i < numArray.length; i++) {
            index += (numArray[i] == 0 || numArray[i] == 9) ?
                    numArray[i] + " находится в массиве под индеком: " + i + "\n" : "";
            result += (numArray[i] == 0 || numArray[i] == 9) ? "" : numArray[i] + "*";
            multiply *= (numArray[i] == 0 || numArray[i] == 9) ? 1 : numArray[i];
        }
        System.out.print(index);
        System.out.println(result.substring(0, result.length() - 1) + " = " + multiply);

        System.out.println("\n3.Удаление элементов массива");
        double[] doubleArray = new double[15];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        int counter = 0;
        for (double number : doubleArray) {
            if (counter == 8) {
                System.out.println("");
            }
            counter++;
            System.out.printf("%.3f ", number);

        }
        counter = 0;
        int countZero = 0;
        double middle = doubleArray[doubleArray.length / 2];
        System.out.printf("\nУдаление из массива значений больше %.3f:\n", middle);
        for (int i = 0; i < doubleArray.length; i++) {
            if (counter == 8) {
                System.out.println("");
            }
            counter++;
            if (doubleArray[i] > middle) {
                doubleArray[i] = 0;
                countZero++;
            }
            System.out.printf("%.3f ", doubleArray[i]);
        }
        System.out.printf("\nВ массиве находилось %d элементов больше %.3f\n", countZero, middle);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        int indexOfChar = 65;
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) indexOfChar;
            indexOfChar++;
        }
        String str = "";
        for (int i = alphabet.length - 1; i >= 0; i--) {
            str += alphabet[i];
            System.out.println(str);
        }

        System.out.println("\n5. Генерация случайных чисел");
        numArray = new int[30];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (60 + Math.random() * 40);
        }
        boolean isRepeat = false;
        while (!isRepeat) {
            isRepeat = true;
            for (int i = 0; i < numArray.length; i++) {
                for (int j = i + 1; j < numArray.length; j++) {
                    if (numArray[i] == numArray[j]) {
                        numArray[j] = (int) (60 + Math.random() * 40);
                        isRepeat = false;
                    }
                }
            }
        }
        isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < numArray.length; i++) {
                if (numArray[i] < numArray[i - 1]) {
                    isSorted = false;
                    int tmp = numArray[i];
                    numArray[i] = numArray[i - 1];
                    numArray[i - 1] = tmp;
                }
            }
        }
        System.out.println("\nОтредактированный массив: ");
        counter = 0;
        for (int number : numArray) {
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
            System.out.printf("%3d ", number);
            counter++;
        }

        System.out.println("\n6.со* Сдвиг элеметов массива.");
        String[] strArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int arrLength = 0;
        System.out.println("Исходный массив:");
        for (String string : strArray) {
            System.out.print("[" + string + "]");
            if (!string.trim().equals("")) {
                arrLength++;
            }
        }
        String[] copyStrArray = new String[arrLength];
        System.arraycopy(strArray, 1, copyStrArray, 0, 1);
        System.arraycopy(strArray, 3, copyStrArray, 1, 3);
        System.arraycopy(strArray, 7, copyStrArray, 4, 3);
        System.out.println("\nОтредактированный массив:");
        for (String string : copyStrArray) {
            System.out.print("[" + string + "]");
        }

    }
}
