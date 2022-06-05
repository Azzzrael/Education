package glava3_kniga;

public class razraydi {
    public static void main(String [] args) {
        int n = 1;
        int fourthBitFrornRight = (n & 8) / 8;
        int fourthBitFromRight = (n & (1 <<3))>>3; /* Значение в правой части операций поразрядного сдвига сокращается по модулю 32
        !если левая часть является целочисленным значением типа long, то правая часть сокращается
        по модулю 64). Например, выражение 1<<35 равнозначно выражению 1<<3 и дает в итоге значение
        8.*/
    }
}
