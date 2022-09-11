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
        int max = 0;
        int min = 0;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }
        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num3) {
            min = num2;
        } else {
            min = num3;
        }
        for(int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n 3. Вывод реверсивного числа и суммы его цифр.");
        int number = 1234;
        int sum = 0;
        System.out.print("реверсия исходного числа: ");
        while(number > 0) {
            System.out.print(number % 10);
            sum += number % 10;
            number /= 10;
        }
        
        System.out.println("\nсумма его цифр: " + sum);

        System.out.println("\n 4. Вывод чисел на консоль в несколько строк.");
        int tmp = 0;
        for(int i = 1; i < 24; i += 2) {
            if(tmp % 5 != 0 || tmp == 0) {
                System.out.printf("%2d ",i);
            } else {
                System.out.printf("%n%2d ",i);
            }
            tmp++;
        } 
        while(tmp % 5 != 0) {
            System.out.printf("%2d ", 0);
            tmp++;
        }

        System.out.println("\n 5. Проверка количества единиц на четность.");
        number = 3141591;
        counter = 0;
        tmp = number;
        while(tmp > 0) {
            if(tmp % 10 == 1) {
                counter++;
            }
            tmp = tmp / 10;
        }
        if(counter % 2 == 0) {
            System.out.println("число " + number + " содержит " + counter + " четное количество единиц");
        } else {
            System.out.println("число " + number + " содержит " + counter + " нечетное количество единиц");
        }

        System.out.println("\n 6.Отображение фигур в консоли.");
        for(int x = 0; x <= 5; x++) {
            for(int y = 0; y <= 10; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
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
        row = 0;
        do {
            int column = row;
            if(row < 3) {
                column = row;
            } else {
                column = 4-row;
            }
            do{
            System.out.print("$");
            column--;
            } while(column >= 0);
        System.out.println();
        row++;
        } while(row < 5);

        System.out.println("\n 7. Отображение ASCII-символов.");
        for(int i = 1; i <= 47; i += 2) {
            char aChar =(char)i;
            System.out.printf("%2d | %c\n",i ,aChar);
        }
        for(int i = 97; i <= 122; i += 2) {
        char aChar = (char)i;
        System.out.printf("%3d | %c\n",i ,aChar);
        }

        System.out.println("\n 8. Проверка, является ли число палиндромом.");
        number = 1234321;
        int original = number;
        int reverse = 0;
        while(number != 0) {
            reverse = reverse *10 + number % 10;
            number = number / 10;
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
        tmp = 0;
        while(tmp < 3) {
            sumStart += startNum % 10;
            startNum = startNum / 10;
            sumEnd += endNum % 10;
            endNum = endNum / 10;
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
        for(int x = 2; x <= 9; x++) {
            System.out.printf("%3d", x);
        }
        System.out.println();
        char line = 22;
        for(int x = 0; x <= 26; x++) {
            System.out.print(line);
        }
        System.out.println();
        for(int x = 2; x <= 9; x++) {
            System.out.print(x + " |");
            for(int y = 2; y <= 9; y++) {
                System.out.printf("%3d", x * y);
            }
            System.out.println();
        }
    }
}