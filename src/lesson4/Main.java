package lesson4;

import java.security.KeyStore;

public class Main {
    public static void main(String [] args) {
        System.out.println("peremennie");

        int age = 20;
        System.out.println("vozrast: " +age+".");
        age = 45;
        System.out.println(age);
        // byte -OT -128 до 127 и занимает 1 байт
        // short - 0T 32768 до 32767 и занимает 2 байта
        // int - OT -2147483648 до 2147483647 и занимает 4 байта
        // Long- OT -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 Занимает 8 байт .  очень редко используется

        byte age1 = 127;
        short num1 = 128;
        int num2 = 56;
        long num3 = 4567;

        float num4 = 4.49384f; // ф нужно писать
        double num5 = 4.989548599458; // очень редко используется

        char ch = 't'; // хранить лишь один символ
        String user_name = "Azrael"; //набор из символов- строки
        System.out.println(user_name);

        boolean isHappy = true; // ili false


    }
}
