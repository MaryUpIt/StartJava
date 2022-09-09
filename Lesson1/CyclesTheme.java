public class CyclesTheme {
    public static void main (String[] args) {
        System.out.println ("\n 1. Подсчет суммы четных и нечетных чисел.");
        int number = -10;
        int sumOfeven = 0;
        int sumOfNotEven = 0;
        while(number <= 21) {
            if (number % 2 == 0) {
                sumOfeven += number;
            } else {
                sumOfNotEven += number;
            }
            number++;
        }
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumOfeven + 
            ", а нечетных = " + sumOfNotEven);

        System.out.println ("\n 2. Вывод чисел в интервале (min и max) в порядке убывания.");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num1 >= num2){
            max = num1;
            min = num2;
            if (num3 > max) {
                max = num3;
            } else if (num3 < min){
                min = num3;
            } 
        } else {
            max = num2;
            min = num1;
            if (num3 > max) {
                max = num3;
            } else if (num3 < min){
                min = num3;
            } 
        }
        for (int i = max; i >= min; i--){
            System.out.print(i + " ");
        }

        System.out.println ("\n 3. Вывод реверсивного числа и суммы его цифр.");
        number = 1234;
        int sum = 0;
        int reverseNumber = 0;
        while (number > 0) {
            int surplus = number % 10;
            reverseNumber = reverseNumber * 10 + surplus;
            sum += surplus;
            number = number/10;
        }
        System.out.println("реверсия исходного числа: " + reverseNumber);
        System.out.println("сумма его цифр: " + sum);

        System.out.println ("\n 4. Вывод чисел на консоль в несколько строк.");
        int tmp = 0;
        for (int i = 1; i < 24; i += 2) {
            if (tmp % 5 != 0 || tmp == 0) {
                System.out.printf("%2d ",i);
            } else {
                System.out.printf("%n%2d ",i);
            }
            tmp++;
        } 
        while (tmp % 5 != 0) {
            System.out.printf("%2d ", 0);
            tmp++;
        }
        System.out.println ("\n 5. Проверка количества единиц на четность.");
        number = 3141591;
        int counter = 0;
        tmp = number;
        while(tmp > 0) {
            if (tmp % 10 == 1) {
                counter++;
            }
            tmp = tmp / 10;
        }
        if (counter % 2 == 0){
            System.out.println("число " + number + " содержит " + counter + " четное количество единиц");
        } else {
            System.out.println("число " + number + " содержит " + counter + " нечетное количество единиц");
        }

        System.out.println ("\n 6.Отображение фигур в консоли.");
        for (int x = 0; x <= 5; x++){
            for (int y = 0; y <= 10; y++){
                System.out.print("*");
            }
            System.out.println();
        }
        tmp = 5;

        while (tmp != 0){
            int j = tmp;
            while (j != 0){
                System.out.print("#");
                j--;
            }
            System.out.println();
            tmp--;
        }
        tmp = 0;
        do {
            if( tmp < 3) {
                int j = tmp;
            } else {
                j = 4-i;
            }
            do{
            System.out.print("$");
            j--;
        } while(j >= 0);
        System.out.println();
        tmp++;
        } while (tmp < 5);

        System.out.println ("\n 7. Отображение ASCII-символов.");
        for (int i = 1; i <= 47; i += 2){
            char aChar = (char)i;
            System.out.printf("%2d | %c\n",i ,aChar);
        }
        for (int i = 97; i <= 122; i += 2){
        char aChar = (char)i;
        System.out.printf("%3d | %c\n",i ,aChar);
        }

        System.out.println ("\n 8. Проверка, является ли число палиндромом.");
        number = 1234321;
        int original = number;
        int reverse = 0;
        while (number !=0){
            reverse = reverse *10 + number % 10;
            number = number / 10;
        }
        if (original == reverse){
            System.out.println("число " + original + " является палиндромом");
        } else {
            System.out.println("число " + original + " не является палиндромом");
        }

        System.out.println ("\n 9. Определение, является ли число счастливым.");
        number = 783391;
        int startNum = number / 1000;
        int endNum  = number % 1000;
        int sumOfstart = 0;
        int sumOfEnd = 0;
        i = 0;
        while (i<3){
            sumOfstart +=startNum % 10;
            startNum = startNum / 10;
            sumOfEnd += endNum % 10;
            endNum = endNum / 10;
            i++;
        }
        System.out.println("Сумма цифр " + number / 1000 + " = " + sumOfstart);
        System.out.println("Сумма цифр " + number % 1000 + " = " + sumOfEnd);
        if (sumOfEnd == sumOfstart){
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println ("\n 10. Вывод таблицы умножения Пифагора");
        System.out.print("  |");
        for (int x = 2; x <= 9; x++) {
            System.out.printf("%3d", x);
        }
        System.out.println();
        char line = 22;
        for(int x = 0; x <= 26; x++){
            System.out.print(line);
        }
        System.out.println();
        for (int x = 2; x <= 9; x++){
            System.out.print( x + " |");
            for(int y = 2; y <= 9; y++){
                System.out.printf("%3d", x * y );
            }
            System.out.println();
        }
    }
}