public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        char sign = '^';
        int b = 5;
        int result = 0;
        if (sign =='+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if (b != 0){
                result = a / b;
            } else {
            System.out.println("Error");
            }
        } else if (sign == '%') {
            if (b != 0) {
                result = a % b;
            } else {
            System.out.println("Error");
            }
        } else if (sign == '^') {
            if (b != 0) {
                result = a;;
                int tmp = b;
                while (tmp > 1) {
                    result = result * a;
                    tmp--;
                }
            } else {
                result = 1;
            }
        } else {
            System.out.println("Error");
        }
        System.out.println(a + "" + sign + "" + b + "=" + result);

        
    }
}