package com.startjava.lesson_2_3_4.arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива.");
        int[] numbers = {4, 2, 5, 7, 1, 3, 6};
        System.out.print("Исходный массив:\n");
        printArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = tmp;
        }
        System.out.print("\nРеверсия исходного массива:\n");
        printArray(numbers);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println("Под индексом 0 в массиве находится число: " + numbers[0]);
        System.out.println("Под индексом 9 в массиве находится число: " + numbers[9]);
        System.out.print("Умножение элементов массива: ");
        int productNumbers = 1;
        for (int i = 1; i < numbers.length - 1; i++) {
            productNumbers *= numbers[i];
            System.out.print(numbers[i] + ((i != numbers.length - 2) ? " * " : " = " + productNumbers));
        }

        System.out.println("\n\n3.Удаление элементов массива");
        double[] doubleNumbers = new double[15];
        for (int i = 0; i < doubleNumbers.length; i++) {
            doubleNumbers[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printArray(doubleNumbers, 8);

        double middleNumber = doubleNumbers[doubleNumbers.length / 2];
        int countZero = 0;
        System.out.printf("\nУдаление из массива значений больше %.3f:\n", middleNumber);
        for (int i = 0; i < doubleNumbers.length; i++) {
            if (doubleNumbers[i] > middleNumber) {
                doubleNumbers[i] = 0;
                countZero++;
            }
        }
        printArray(doubleNumbers, 8);
        System.out.printf("\nВ массиве находилось %d элементов больше %.3f\n", countZero, middleNumber);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        int indexOfChar = 65;
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) indexOfChar;
            indexOfChar++;
        }
        String str = "";
        for (int i = alphabet.length - 1; i >= 0; i--) {
            System.out.println(str += alphabet[i]);
        }

        System.out.println("\n5. Генерация случайных чисел");
        numbers = new int[30];
        for (int i = 0; i < numbers.length; i++) {
            boolean unique = false;
            while (!unique) {
                numbers[i] = (int) (60 + Math.random() * 40);
                for (int j = 0; j <= i; j++) {
                    unique = true;
                    if (i != j && numbers[i] == numbers[j]) {
                        unique = false;
                        break;
                    }
                }
            }
        }
        printArray(numbers, 10);
        sortArray(numbers);
        System.out.println("\nОтредактированный массив: ");
        printArray(numbers, 10);

        System.out.println("\n6.со* Сдвиг элеметов массива.");
        String[] srcArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int newLength = 0;
        System.out.println("Исходный массив:");
        for (String string : srcArray) {
            System.out.print("[" + string + "]");
            if (!string.isBlank()) {
                newLength++;
            }
        }
        String[] desArray = new String[newLength];
        int srcIndex = 0;
        int desIndex = 0;
        while (srcIndex < srcArray.length) {
            int counterElement = 0;
            if(srcArray[srcIndex].isBlank()) {
                srcIndex++;
            }
            int counterIndex = srcIndex;
            while (counterIndex < srcArray.length && !srcArray[counterIndex].isBlank()) {
                counterElement++;
                counterIndex++;
            }
            System.arraycopy(srcArray, srcIndex, desArray, desIndex, counterElement);
            desIndex += counterElement;
            srcIndex += counterElement;
        }

        System.out.println("\nОтредактированный массив:");
        for (String string : desArray) {
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
