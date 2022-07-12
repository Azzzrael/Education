package dudarYoutube.goshadudar;

import java.util.Scanner;


public class Main {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
 /*       System.out.print("Vvedite vashe imya: ");
        String user_name = scan.nextLine(); //сам ввод кода в консоли
        System.out.print("Privet, "+user_name);
        int num1 = scan.nextInt(); // только для чисел
        byte num2 = scan.nextByte();
        boolean num3 = scan.nextBoolean();*/
        System.out.println("Vvedite pervoe chislo: ");
        float num1 = scan.nextFloat();
        System.out.println("Vvedite vtoroe chislo: ");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println(res1 + "\n"+ res2 + "\n"+ res3 + "\n"+ res4 + "\n"); //калькулятор


        /*float num1 = 50, num2 = 33; // если делить
        float res = num1 % num2;
        res += 10; // плюс , минус, умножить, разделить
        res++; // добавляет единицу
        System.out.println("Result: "+res); */
    }
}
