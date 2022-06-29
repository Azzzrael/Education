package Practice.eniya;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Eniya {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>(); // zadaem massiv
        String str; // vvodim peremennie
        FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\itproger\\src\\Practice\\eniya\\input.txt"); // poluchaem chisla
        Scanner sc = new Scanner(fileInput);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " "); //vvodim razdelitel v vide probela
        while (st.hasMoreTokens()) {
            int a = Integer.valueOf(st.nextToken());
            numbers.add(a); //poluchaem massiv iz file
            int b = Integer.valueOf(st.nextToken());
            numbers.add(b);
            int c = Integer.valueOf(st.nextToken());
            numbers.add(c);
            int res = a * b * c * 2;
            FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\itproger\\src\\Practice\\eniya\\output.txt");// Запись числа в файл
            Answer.write(String.valueOf(res));
            Answer.close();
        }
    }
}
