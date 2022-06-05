package lesson6_dudar;

import java.util.Scanner;

public class primer2 {
    public static void main(String[] args) {
        // switch-case - dlya proverki peremennoi na mnogie uslivya
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            case 10:
                System.out.println("Number is 10");
                break;
            default:
                System.out.println("Default");
        }




    }
}
