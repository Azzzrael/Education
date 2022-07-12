package dudarYoutube.lesson9_collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Коллекции java
        // ЭрейЛист - лучше если нужно внести данные в массив и дальше работать с массивом.
        ArrayList<Integer> numbers = new ArrayList<>();
        int s = 0;
        numbers.add(10);
        numbers.add(20);

        for(Integer el : numbers) {  // ел - теперь перебирает по елементно вместо вывода i++
            s +=el;
            System.out.println(el);
        }
        System.out.println(s);


    }

}
