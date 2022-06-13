package lesson9_collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Коллекции java
        // ЭрейЛист - лучше если нужно внести данные в массив и дальше работать с массивом.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1,69);

        //     System.out.println("Kol-vo elementov: "+numbers.size());

        System.out.println(numbers.get(1)); // вывести первый элемент

        numbers.remove(1); // удалить выбранный элемент
        //      numbers.clear(); // очистка всего списка


        for(Integer el : numbers) {  // ел - теперь перебирает по елементно вместо вывода i++
            System.out.println(el);
        }


    }

}
