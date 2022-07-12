package dudarYoutube.lesson7_dudar;

public class Main {
    public static void main(String[] args) {
        //цикл for
        for (int i = 5; i < 25;  i+=2) {
            if (i % 3 == 0)
                continue; // пропускает итерацию . дальше код не идет.
            if (i >= 17)
                break; // полностью останавливает

            System.out.println("Element: " +i);
        }


    }
}
