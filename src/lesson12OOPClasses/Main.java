package lesson12OOPClasses;

public class Main {
    public static void main(String[] args) {

        Transport vw = new Transport();
        vw.setValues(210.5f,900,"Blue", new byte[] {0,0,0});
        String res1 = vw.getValues();
        System.out.println(res1);
//        vw.speed = 210.5f;
//        vw.weight = 900;
//        vw.color = "Blue";
//        vw.coordinate = new byte[] {0,0,0};

        Transport truck = new Transport();
        truck.speed = 140.5f;
        truck.weight = 6700;
        truck.color = "Black";
        truck.coordinate = new byte[] {100,0,100};

        String res2 = truck.getValues();
        System.out.println(res2);


    }
}
