package lesson12OOPClasses;

public class Main {
    public static void main(String[] args) {

    //    Car car = new Car(210.5f, 900, "Blue", new byte[]{0, 0, 0});

        Transport transport = new Car (210.5f, 900, "Blue", new byte[]{0, 0, 0});

        Truck truck = new Truck(6700, new byte[]{100, 0, 100}, false);
        truck.setValues(210.5f, 900, "Blue", new byte[]{0, 0, 0},true);
        System.out.println(truck.getValues());
    }
}
