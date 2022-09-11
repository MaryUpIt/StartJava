
public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println(" 1.Перевод псевдокода на язык Java");
        String name = "Ignat";
        int age = 25;
        double height = 1.95;
        boolean male = true;
        if (age > 20) {
            System.out.println("Age over 20 years");
        } else {
            System.out.println("Age less then 20 years");
        }
        if(!male) {
            System.out.println("female");
        } else {
            System.out.println("male");
        }
        if (height < 1.80) {
            System.out.println("Height less them 1.80 m");
        } else {
            System.out.println("Height over 1.80 m");
        }
        char firstNameChar = name.charAt(0);
        if (firstNameChar == 'M') {
            System.out.println("Name start at M");
        } else if (firstNameChar == 'I') {
            System.out.println("Name start at I");
        } else {
            System.out.println("Name not start at M or I");
        }

        System.out.println("\n 2.Поиск max и min числа.");
        int num1 = 45;
        int num2 = 32;
        if (num1 == num2) {
            System.out.println(num1 + " equals "+ num2);
        } else {
            if (num1 > num2) {
                System.out.println(num1 +" is max " + num2 + " is min");
            } else {
                System.out.println(num2 +" is max " + num1 + " is min");
            }
        }

        System.out.println("\n 3.Работа с числом.");
        num1 = 23;
        if (num1 != 0) {
             if (num1 < 0) {
                System.out.print(num1 + " is negative ");
            } else {
                System.out.print(num1 + " is positive ");
            }
            if (num1 % 2 == 0) {
                System.out.println("and even-number.");
            } else {
                System.out.println("and not enen-number.");
            }
        } else {
            System.out.println(num1 + " is zero.");
        }

        System.out.println("\n 4.Поиск одинаковых цифр в числах.");
        num1 = 468;
        num2 = 568;
        if (num1 / 100 != num2 / 100 && num1 % 100 / 10 != num2 % 100 / 10
         && num1 % 10 != num2 % 10) {
            System.out.println("Numbers " + num1 + " & " + num2 +" hasn't same digits");
        } else {
            System.out.print("Numbers " + num1 + " & " + num2 +" has: ");
        if (num1 / 100 == num2 / 100) {
            System.out.print(num1 / 100 + " at first digit " );
        } 
        if (num1 % 100 / 10 == num2%100 / 10) {
            System.out.print(num1 % 100 / 10 + " at second digit ");
        }
        if (num1 % 10 == num2 % 10) {
            System.out.print(num1 % 10 + " at third digit");
        } 
    }

        System.out.println("\n 5.Определение буквы, числа или символа по их коду.");
        char symbol = '\u0057';
        System.out.println(symbol);
        if (symbol >= 48 && symbol <= 57) {
            System.out.println(symbol + " is number.");
        } else if (symbol >= 65 && symbol <= 90) {
            System.out.println(symbol + " is a capital letter.");
        } else if (symbol >= 97 && symbol <= 122) {
            System.out.println(symbol + " is a letter.");
        } else {
            System.out.println(symbol + "isn't a number or letter.");
        }

        System.out.println("\n 6.Определение суммы вклада и начисленных банком %.");
        int deposit = 300_000;
        int commision;
        if (deposit <= 100_000) {
            commision = 5;
        } else if (deposit > 300_000) {
            commision = 10;
        } else {
            commision = 7;
        }
        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Процент по вкладу: " + commision);
        System.out.println("Итоговая сумма долга за год: " + (deposit + deposit * commision / 100));

        System.out.println("\n 7. Определение оценки по предметам.");
        int percentHistory = 59;
        int percentProgram = 91;
        int scoreHistory;
        int scoreProgram;
        if (percentHistory > 91) {
            scoreHistory = 5;
            System.out.println(scoreHistory + " : History.");
        } else if (percentHistory > 73) {
            scoreHistory = 4;
            System.out.println(scoreHistory + " : History.");
        } else if(percentHistory > 60) {
            scoreHistory = 3;
            System.out.println(scoreHistory + " : History.");
        } else {
            scoreHistory = 2;
            System.out.println(scoreHistory + " : History.");
        }
        if (percentProgram > 91) {
            scoreProgram = 5;
            System.out.println(scoreProgram + " : Programming.");
        } else if (percentProgram > 73) {
            scoreProgram = 4;
            System.out.println(scoreProgram + " : Programming.");
        } else if(percentProgram > 60) {
            scoreProgram = 3;
            System.out.println(scoreProgram + " : Programming.");
        } else {
            scoreProgram = 2;
            System.out.println(scoreProgram + " : Programming.");
        }
        System.out.println("Average score: " + (scoreProgram + scoreHistory) / 2);
        System.out.println("Average percents: " + (percentHistory + percentProgram) / 2);
        
        System.out.println("\n 8.Расчет прибыли.");
        int rentAtMonth = 5000;
        int profitAtMonth = 13000;
        int purchase = 9000;
        int annualProfit = 12 * (profitAtMonth - rentAtMonth - purchase);
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }
        System.out.println("\n 9.Подсчет количества банкнот.");
        int usd = 567;
        int usd100 = usd / 100;
        int usd10 = usd % 100 / 10;
        int usd1 = usd % 10;
        if (usd10 > 5) {
            usd1 = usd1 + (usd10 - 5) * 10;
            usd10 = 5;
            
        }
        System.out.println("номиналы банкнот: 1$, 10$, 100$");
        System.out.println("требуемое количество банкнот: " + usd100 + " шт. по 100$, " + 
            usd10 + " шт. по 10$, " + usd1 + " шт. по 1$.");
        System.out.println("посчитанная исходная сумма: " + 
            (usd100 * 100 + usd10 * 10 + usd1));
    }
    }