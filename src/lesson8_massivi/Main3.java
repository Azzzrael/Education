package lesson8_massivi;

public class Main3 {
    public static void main(String[] args) {
        //mnogomernie massivi dannih
        char[][] syms = new char[2][2];
        // визуально выглядит так [[4,6,6],[5,6,7]] - двухмерный массив
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte [][] nums = new byte[][]{
                {5,7},
                {7,3},
                {2,0},
        };
        nums [1][1] = 67;
        System.out.println(nums [2][0]);
        nums [2][1] = 69;
        System.out.println(nums [1][1]);
        System.out.println(nums [2][0]);
        System.out.println(nums [2][1]);

        //for() первый массив перебирает
           // for() второй массив перебирает
    }

}
