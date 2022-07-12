package dudarYoutube.lesson10_functions;

public class MainMetodi {
    public static void main(String[] args){
        //Методы Java
        byte[] nums1 = new byte[] {5,6,8};

        int summ1 = summArray(nums1);
        info("Summa 1: "+summ1);

        byte[] nums2 = new byte[] {9,6,34,3,3,2,3,4};
        int summ2 = summArray(nums2);
        info("Summa 2: "+summ2);

    }

    public static int summArray(byte[] arr) {
        int summa = 0;
        for(byte i = 0; i <arr.length; i++)
            summa += arr[i];

            return summa;
    }

    public static void info(String word){
        System.out.print(word);
        System.out.println(" mat' ego cifer");
    }

}
