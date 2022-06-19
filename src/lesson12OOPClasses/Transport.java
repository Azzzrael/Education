package lesson12OOPClasses;

public class Transport {

    // public - доступна отовсюду
    //protected - используеться в наследовании
    //private
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(float speed, int weight, String color, byte[] coordinate) {
        // Join to DB
        System.out.println("Konstruktor 1");
        setValues(speed, weight, color, coordinate);
        System.out.println(getValues());
    }

    public Transport(int weight,byte[] coordinate){
        System.out.println("Konstruktor 2");
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(this.getValues());
    }

    public void setValues(float speed, int weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;

    }

    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: "+weight +". Color: "+color + ".\n";
        String infoCoordinates  = "Coordinates:\n";

        for(int i=0; i< coordinate.length;i++) {
                infoCoordinates += coordinate[i] + "\n";
        }

        return info+infoCoordinates;
    }
}
