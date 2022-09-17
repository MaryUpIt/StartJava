public class Calculator {
    private int a;
    private int b;
    private char sign;

    public Calculator(int a, int b, char sign) {
        this.a = a;
        this.b = b;
        this.sign = sign;
    }

    public int calculate() {
        switch(sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Ошибка: делить на ноль нельзя!");
                    break;
                }
            case '%':
                if (b != 0) {
                    return a % b;
                } else {
                    System.out.println("Ошибка: делить на ноль нельзя!");
                    break;
                }
            case '^':
                int result = 1;
                while (b >= 1) {
                    result *= a;
                    b--;
                }
                return result;
            default:
                System.out.println("Ошибка: знак операции неверный!");
            }
        return 0;
    }
}
