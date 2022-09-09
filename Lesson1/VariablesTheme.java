
public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль.");
        byte countCore = 4;
        short ram = 8;
        int systemValue = 64;
        long hardValue = 498_943_150_789l;
        float firstCpu = 1.8f;
        double secondCpu = 1.99 ;
        boolean isWindows = true;
        System.out.println("Параметры компьютера: ");
        System.out.println("количество ядер: " + countCore);
        System.out.println("частота процессора: " + (firstCpu + secondCpu));
        System.out.println("оперативная память: " + ram);
        System.out.println("операционная система: ");
        
        if (isWindows) {
            System.out.println("Windows");
            System.out.println("разрядность операционной системы: " + systemValue);
        } else {
            System.out.println("система неизвестна");
        }
        
        System.out.println("\n 2. Расчет стоимости товара со скидкой.");
        double pricePen = 100;
        double priceBook = 200;
        double discount = 11;
        System.out.println("Сумма скидки: " + (100 - discount) / 100);
        System.out.println("Стоимость товаров со скидкой: " + ((pricePen + priceBook) * 
                ((100 - discount) / 100)));

        System.out.println("\n 3. Вывод на консоль слова JAVA.");
        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a");
        
        System.out.println("\n 4. Отображение min и max значений числовых типов данных.");
        byte maxByte = 127;
        System.out.println("исходное значение: " + maxByte + 
                "\n+ после инкремента: " + ++maxByte + "\n- после декремента: " + --maxByte);
        short maxShort = 32_767;
        System.out.println("исходное значение: " + maxShort + 
                "\n+ после инкремента: " + ++maxShort + "\n- после декремента: " + --maxShort);
        int maxInt = 2_147_483_647;
        System.out.println("исходное значение: " + maxInt + 
                "\n+ после инкремента: " + ++maxInt + "\n- после декремента: " + --maxInt);
        long maxLong = 9223372036854775807l;
        System.out.println("исходное значение: " + maxLong + 
                "\n+ после инкремента: " + ++maxLong + "\n- после декремента: " + --maxLong);

        System.out.println("\n 5. Перестановка значений переменных.");
        int a = 2;
        int b = 5;
        int tmp;
        System.out.println("+ с помощью третьей переменной");
        System.out.printf("до: a = %d, b = %d\n", a, b);
        tmp = a;
        a = b;
        b = tmp;
        System.out.printf("после: a = %d, b = %d\n", a, b);
        System.out.println("+ с помощью арифметических операций");
        System.out.printf("до: a = %d, b = %d\n", a, b);
        a += b;
        b = a - b;
        a -= b;
        System.out.printf("после: a = %d, b = %d\n", a, b);
        System.out.println("+ с помощью побитовой операции");
        System.out.printf("до: a = %d, b = %d\n", a, b);
        b = a^b;
        a = a^b;
        b = a^b;
        System.out.printf("после: a = %d, b = %d\n", a, b);

        System.out.println("\n 6.Вывод символов и их кодов.");
        int codeChar = 35;
        System.out.println ("код : " + codeChar + "|" + "символ : " + (char) codeChar);
        codeChar = 38;
        System.out.println ("код : " + codeChar + "|" + "символ : " + (char) codeChar);
        codeChar = 64;
        System.out.println ("код : " + codeChar + "|" + "символ : " + (char) codeChar);
        codeChar = 94;
        System.out.println ("код : " + codeChar + "|" + "символ : " + (char) codeChar);

        System.out.println("\n 7.Отображение количества сотен, десятков и единиц числа.");
        int num = 123;
        System.out.println("Число N содержит:");
        System.out.println(num / 100 + " сотен");
        System.out.println(num % 100 / 10 + " десятков");
        System.out.println(num % 10 + " единиц");
        
        System.out.println("\n 8.Вывод на консоль ASCII-арт Дюка.");
        char space = 32;
        char backSlash = 92;
        char slash = 47;
        char underLine = 95;
        char openBrace = 40;
        char closeBrace = 41;
        System.out.println("" + space + space + space + space + slash + backSlash);
        System.out.println("" + space + space + space + slash +space +space + backSlash);
        System.out.println("" + space + space + slash + underLine + openBrace + space + closeBrace + backSlash);
        System.out.println("" + space + slash + space + space + space + space + space + space + backSlash);
        System.out.println("" + slash + underLine + underLine + underLine + underLine +
                slash + backSlash + underLine + underLine + backSlash);

        System.out.println("\n 9.Произведение и сумма цифр числа.");
        num = 345;
        a = num / 100;
        b = num % 100 / 10;
        int c = num % 10;
        System.out.println("сумма цифр числа N = " + (a + b + c));
        System.out.println("произведение цифр числа N = " + (a * b * c));
        
        System.out.println("\n 10.Преобразование секунд.");
        int sec = 86399;
        System.out.println (sec / 60 / 60 + ":" + sec / 60 % 60 + ":" + sec % 60);

    }
}