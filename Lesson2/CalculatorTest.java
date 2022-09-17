import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (!answer.equals("no")) {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            Calculator calculator = new Calculator(a, b, sign);
            System.out.printf("%d %c %d = %d\n", a, sign, b, calculator.calculating());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}
