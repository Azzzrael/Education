package dudarYoutube.lesson8_massivi;

public class Main {
    public static void main(String[] args) {
        //massivi
        int [] nums = new int[5];// 5 - kol-vo elementov v massive ( ot do 4, 5 ne vhodit) - vsegda na odin menshe chem v nazvanii
        nums[0] = 4116;
        nums[1] = 45;
        nums[2] = 1;
        nums[4] = 13;
        int res = nums[0] + nums[2];
        System.out.println(res);  // индекс стартует с 0. 1=0, 2=1. и тд

        float[] nums2 = new float[] {5.0f, 6.45f, 89.984f};
        System.out.println(nums2[1]);
        //циклы удобнее всего использовать с массивами, особенно for

        for(int i = 0; i < nums2.length; i++){ // .length - свойство, длинна всего массива.
            System.out.println("Element: "+nums2[i]);
        }

    }
}
