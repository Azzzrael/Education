package dudarYoutube.lesson6_dudar;

public class Main {
    public static void main(String[] args) {
        // условные конструкции if - else
        int a = 10, b = 10;
        char sym1 = 'A', sym2 = 'a';
        boolean isHasCar = false;
        if (isHasCar || a == b || sym1!=sym2) {  // || - eto znachit ili. && - i 1e i 2e uslovie doljni bit vernie.
                                    // > , < , == , >= , <=, !=
                                    // (!isHasCar) - если нужно проверить на неравенство, (isHasCar) - на равенство
            System.out.println("Da,verno");
            if (sym1!=sym2){
                System.out.println("oni je odinakovie, natash");
            }
            } else if (a < b) {
            System.out.println("second test");
        } else if (a > b) {
            System.out.println("third test");
        } else if (a <= b) {
            System.out.println("fourth test");
        } else if (a == b) {
            System.out.println("fifth test");
        } else {
            System.out.println("ne verno");
        }
    }
}
