package dudarYoutube.lesson8_massivi;

import java.util.Scanner;

public class Main2 {  //массив, в котором пользователь вводит элементы массива
    public static void main(String[] args) {
        //massives
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int i =0; i < arr.length;i++){
            System.out.print("Enter number: ");
            int value = scanner.nextInt();
            arr[i]=value;
        }
        // ishem minimalnoe znachenie
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("Minimal: "+min);
    }
}