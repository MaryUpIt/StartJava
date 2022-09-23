package com.startjava.lesson_2_3_4.arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива.");
        int[] numbers = {4, 2, 5, 7, 1, 3, 6};
        System.out.print("Исходный массив:\n");
        printArray(numbers);
        System.out.print("\nРеверсия исходного массива:\n");
        printArray(reverseArray(numbers));

        System.out.println("\n\n2. Вывод произведения элементов массива");
        numbers = new int[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }
        System.out.println("Под индексом 0 в массиве находится число: " + numbers[0]);
        System.out.println("Под индексом 9 в массиве находится число: " + numbers[9]);
        System.out.print("Умножение элементов массива: ");
        int multiplyNumbers = 1;
        for (int i = 1; i < numbers.length - 1; i++) {
            multiplyNumbers *= numbers[i];
            System.out.print(numbers[i] + ((i == numbers.length - 2) ? " = " + multiplyNumbers : " * "));
        }

        System.out.println("\n\n3.Удаление элементов массива");
        double[] values = new double[15];
        for (int i = 0; i < values.length; i++) {
            values[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printArray(values, 8);

        double middleValue = values[values.length / 2];
        int countZero = 0;
        System.out.printf("\nУдаление из массива значений больше %.3f:\n", middleValue);
        for(int i = 0; i < values.length; i++) {
            if (values[i] > middleValue) {
                values[i] = 0;
                countZero++;
            }
        }
        printArray(values, 8);
        System.out.printf("\nВ массиве находилось %d элементов больше %.3f\n", countZero, middleValue);

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
        numbers = new int[30];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (60 + Math.random() * 40);
        }
        boolean isRepeat = false;
        while (!isRepeat) {
            isRepeat = true;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        numbers[j] = (int) (60 + Math.random() * 40);
                        isRepeat = false;
                    }
                }
            }
        }
        sortArray(numbers);
        System.out.println("\nОтредактированный массив: ");
        printArray(numbers, 10);

        System.out.println("\n6.со* Сдвиг элеметов массива.");
        String[] strArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int newLength = 0;
        System.out.println("Исходный массив:");
        for (String string : strArray) {
            System.out.print("[" + string + "]");
            if (!string.isBlank()) {
                newLength++;
            }
        }
        String[] copyStrArray = new String[newLength];
        System.arraycopy(strArray, 1, copyStrArray, 0, 1);
        System.arraycopy(strArray, 3, copyStrArray, 1, 3);
        System.arraycopy(strArray, 7, copyStrArray, 4, 3);
        System.out.println("\nОтредактированный массив:");
        for (String string : copyStrArray) {
            System.out.print("[" + string + "]");
        }

    }

    private static void sortArray(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    isSorted = false;
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                }
            }
        }
    }
    private static void printArray(double[] array, int newLine) {
        for (int i = 0; i < array.length; i++) {
            if (i % newLine == 0 && i != 0) {
                System.out.println();
            }
            System.out.printf("%.3f ", array[i]);
        }
    }
    private static int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        return reverseArray;
    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    private static void printArray(int[] array, int newLine) {
        int newLineIndex = 0;
        for (int number : array) {
            if (newLineIndex % newLine == 0 && newLineIndex != 0) {
                System.out.println();
            }
            System.out.print(number + " ");
            newLineIndex++;
        }
    }
}
