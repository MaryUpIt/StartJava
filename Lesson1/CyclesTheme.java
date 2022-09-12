public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n 1. Подсчет суммы четных и нечетных чисел.");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        while(counter <= 21) {
            if(counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        }
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);

        System.out.println("\n 2. Вывод чисел в интервале(min и max) в порядке убывания.");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;

        if (num2 > max && num2 > num3) {
            max = num2;
        } else if (num3 > max) {
            max = num3;
        }
        if (num1 < min && num1 < num3) {
            min = num1;
        } else if (num3 < min) {
            min = num3;
        }
        for(int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n 3. Вывод реверсивного числа и суммы его цифр.");
        int number = 1234;
        int sum = 0;
        System.out.print("реверсия исходного числа: ");
        while(number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            sum += digit;
            number /= 10;
        }
        
        System.out.println("\nсумма его цифр: " + sum);

        System.out.println("\n 4. Вывод чисел на консоль в несколько строк.");
        counter = 0;
        for(int i = 1; i < 24; i += 2) {
            System.out.printf("%2d ",i);
            counter++;
            if (counter % 5 == 0 && counter != 0) {
                System.out.println();
            }
        } 
        while(counter % 5 != 0) {
            System.out.printf("%2d ", 0);
            counter++;
            if (counter % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n 5. Проверка количества единиц на четность.");
        number = 3141591;
        int countOnes = 0;
        int cloneNumber = number;
        while(cloneNumber > 0) {
            if(cloneNumber % 10 == 1) {
                countOnes++;
            }
            cloneNumber /= 10;
        }
        if(countOnes % 2 == 0) {
            System.out.println("число " + number + " содержит " + countOnes + " четное количество единиц");
        } else {
            System.out.println("число " + number + " содержит " + countOnes + " нечетное количество единиц");
        }

        System.out.println("\n 6.Отображение фигур в консоли.");
        //фигура из *
        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //фигура из #
        int row = 5;
        while(row != 0) {
            int column = row;
            while(column != 0) {
                System.out.print("#");
                column--;
            }
            System.out.println();
            row--;
        }
        // фигура из $
        row = 0;
        do {
            int column = row;
            if(row < 3) {
                column = row;
            } else {
                column = 4-row;
            }
            do {
            System.out.print("$");
            column--;
            } while(column >= 0);
        System.out.println();
        row++;
        } while(row < 5);

        System.out.println("\n 7. Отображение ASCII-символов.");
        for(int i = 1; i <= 47; i += 2) {
            char character =(char)i;
            System.out.printf("%2d | %c\n",i ,character);
        }
        for(int i = 97; i <= 122; i += 2) {
        char character = (char)i;
        System.out.printf("%3d | %c\n",i ,character);
        }

        System.out.println("\n 8. Проверка, является ли число палиндромом.");
        number = 1234321;
        int original = number;
        int reverse = 0;
        while(number != 0) {
            reverse = reverse *10 + number % 10;
            number /= 10;
        }
        if(original == reverse) {
            System.out.println("число " + original + " является палиндромом");
        } else {
            System.out.println("число " + original + " не является палиндромом");
        }

        System.out.println("\n 9. Определение, является ли число счастливым.");
        number = 783391;
        int startNum = number / 1000;
        int endNum  = number % 1000;
        int sumStart = 0;
        int sumEnd = 0;
        int tmp = 0;
        while(tmp < 3) {
            sumStart += startNum % 10;
            startNum /= 10;
            sumEnd += endNum % 10;
            endNum /= 10;
            tmp++;
        }
        System.out.println("Сумма цифр " + number / 1000 + " = " + sumStart);
        System.out.println("Сумма цифр " + number % 1000 + " = " + sumEnd);
        if(sumEnd == sumStart) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n 10. Вывод таблицы умножения Пифагора");
        System.out.print("  |");
        for(int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        char line = 22;
        for(int i = 0; i <= 26; i++) {
            System.out.print(line);
        }
        System.out.println();
        for(int i = 2; i <= 9; i++) {
            System.out.print(i + " |");
            for(int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}