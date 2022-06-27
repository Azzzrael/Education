package lesson12OOPClasses;

public class Car extends Transport{
    public Car(float speed, int weight, String color, byte[] coordinate) {
        // Join to DB
        super(speed, weight, color, coordinate);
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Object dvigaetsya so skorostyu: "+speed);
    }

}
