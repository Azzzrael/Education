package dudarYoutube.lesson6_dudar;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res;
        System.out.print("");
        int num1  = scanner.nextInt();
        scanner.nextLine();

        System.out.print("");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        System.out.print("");
        int num2  = scanner.nextInt();
        scanner.nextLine();

        switch(action) {
            case "+":
                res = num1 + num2;
                System.out.println("="+res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("="+res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("="+res);
                break;
            case "/":
                if (num2==0)
                    System.out.println("Error. U can't do that");
                else {
                    res = num1 / num2;
                    System.out.println("= ");
                    System.out.println(res);
                    break;
                }
            default:
                if (num2==0)
                    System.out.println(" ");
                else {
                    System.out.println("It's not the action ");
                }
        }
    }
}