package dudarYoutube.lesson6_dudar;


import java.util.Scanner;

public class primer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter role: ");
        String role = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass  = scanner.nextLine();
        if (role.equals("Admin") && pass.equals("12345") ){ // чтобы найти точное sovpadenie
            System.out.print("All users");
        } else {
            System.out.print("What is your name?: ");
            String name = scanner.nextLine();

        }

    }
}
