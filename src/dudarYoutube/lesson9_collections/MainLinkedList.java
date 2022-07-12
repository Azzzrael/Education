package dudarYoutube.lesson9_collections;

import java.util.LinkedList;

public class MainLinkedList {

    public static void main(String[] args) {
        //LinkedList - разница лишь в том что ЛинкедЛист - привязывает элементы друг к другу. Другая переиндексация, чуть быстрее.
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.6f);
        numbers.add(7.8f);
        numbers.add(9.332f);

        for (Float el : numbers){
            System.out.println(el);
        }
    }

}