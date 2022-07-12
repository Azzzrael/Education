package dudarYoutube.glava3_kniga;

public class string {
    public static void main(String [] args) {
        String greeting = "Hello";
        String s = greeting.substring(0, 3); //отсчет начинается с 0 - H, 2 - e, 3 - l
        System.out.println (s);
        s.substring (0, 3); //всегда имеет длину Ь - а символов. Так, сформированная выше подстрока "Hel" имеет длину 3 - О = 3.
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = String.join ( "*",expletive , PG13);
        System.out.println (message);
        String all = String.join(" / ", "S", "M", "L", "XL"); // " / " - разделение между выводом.
        System.out.println(all);
        String repeat = "Java".repeat(3);
        System.out.println(repeat);
        greeting = greeting.substring(0,3) + "p!";
        System.out.println(greeting);
        greeting = greeting.substring(0,4) + "less";
        System.out.println(greeting);
    }
}
