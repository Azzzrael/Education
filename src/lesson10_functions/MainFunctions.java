package lesson10_functions;

public class MainFunctions {
    public static void main(String[] args) {
        //Методы в Java
        //функция -небольшая подпрограмма, содержит небольшую часть кода. Мы можем на нее ссылаться далее в программе
//        String java = "java";
//        info(java); // ВЫзов функции
        short num = 7;
        int result1 = summ((short)5,num);

        short num2 = 8;
        int result2 = summ((short)4,num2);

        info(String.valueOf(result2));

    }

    public static int summ(short a, short b) {
        int res = a + b;
        String result = "Результат: " + res;
        info(result);
        return res;
    }

    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");

    }
}
