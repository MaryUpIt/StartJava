package com.startjava.lesson_2_3_4.arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива.");
        int[] intArray = {4, 2, 5, 7, 1, 3, 6};
        int lenArr = intArray.length;
        System.out.println("Исходный массив:");
        printArray(intArray);

        for (int i = 0; i < lenArr; i++) {
            int tmp = intArray[i];
            intArray[i] = intArray[--lenArr];
            intArray[lenArr] = tmp;
        }

        System.out.println("\nРеверсия исходного массива:");
        printArray(intArray);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArray = new int[10];
        lenArr = intArray.length;
        for (int i = 0; i < lenArr; i++) {
            intArray[i] = i;
        }
        System.out.println("Под индексом 0 в массиве находится число: " + intArray[0]);
        System.out.println("Под индексом 9 в массиве находится число: " + intArray[9]);
        System.out.print("Умножение элементов массива: ");
        int productNumbers = 1;
        for (int i = 1; i < lenArr - 1; i++) {
            productNumbers *= intArray[i];
            System.out.print(intArray[i] + ((i != lenArr - 2) ? " * " : " = " + productNumbers));
        }

        System.out.println("\n\n3.Удаление элементов массива");
        double[] doubleArray = new double[15];
        lenArr = doubleArray.length;
        for (int i = 0; i < lenArr; i++) {
            doubleArray[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printArray(doubleArray, 8);

        double middleNumber = doubleArray[lenArr / 2];
        int countZero = 0;
        System.out.printf("\nУдаление из массива значений больше %.3f:\n", middleNumber);
        for (int i = 0; i < lenArr; i++) {
            if (doubleArray[i] > middleNumber) {
                doubleArray[i] = 0;
                countZero++;
            }
        }
        printArray(doubleArray, 8);
        System.out.printf("\nВ массиве находилось %d элементов больше %.3f\n", countZero, middleNumber);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        int codeChar = 65;
        lenArr = alphabet.length;
        for (int i = 0; i < lenArr; i++) {
            alphabet[i] = (char) codeChar++;
        }
        String str = "";
        for (int i = lenArr - 1; i >= 0; i--) {
            System.out.println(str += alphabet[i]);
        }

        System.out.println("\n5. Генерация случайных чисел");
        intArray = new int[30];
        lenArr = intArray.length;
        for (int i = 0; i < lenArr; i++) {
            boolean unique = false;
            while (!unique) {
                intArray[i] = (int) (60 + Math.random() * 40);
                for (int j = 0; j <= i; j++) {
                    unique = true;
                    if (i != j && intArray[i] == intArray[j]) {
                        unique = false;
                        break;
                    }
                }
            }
        }
        sortArray(intArray);
        System.out.println("Отсортированные значения: ");
        printArray(intArray, 10);

        System.out.println("\n6.со* Сдвиг элементов массива.");
        String[] srcArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int newLength = 0;
        System.out.println("Исходный массив:");
        for (String string : srcArray) {
            System.out.print("[" + string + "]");
            if (!string.isBlank()) {
                newLength++;
            }
        }
        String[] destArray = new String[newLength];
        int srcIndex = 0;
        int destIndex = 0;

        while (srcIndex < srcArray.length) {
            int countStrings = 0;
            if (srcArray[srcIndex].isBlank()) {
                srcIndex++;
                continue;
            }
            while (!srcArray[srcIndex].isBlank()) {
                countStrings++;
                srcIndex++;
            }
            System.arraycopy(srcArray, srcIndex  - countStrings, destArray, destIndex, countStrings);
            destIndex += countStrings;
        }
        System.out.println("\nОтредактированный массив:");
        for (String string : destArray) {
            System.out.print("[" + string + "]");
        }
    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
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

    private static void printArray(int[] array, int newLine) {
        int newLineIndex = 0;
        for (int number : array) {
            newLineIndex++;
            System.out.print(number + " ");
            if (newLineIndex % newLine == 0 && newLineIndex != 0) {
                System.out.println();
            }
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
}
