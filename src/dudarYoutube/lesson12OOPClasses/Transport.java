package dudarYoutube.lesson12OOPClasses;

public abstract class Transport {

    // public - доступна отовсюду
    //protected - используеться в наследовании
    //private
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;


    public Transport(float speed, int weight, String color, byte[] coordinate) {
        // Join to DB
        setValues(speed, weight, color, coordinate);
  //      System.out.println(getValues());
    }

    public Transport(int weight,byte[] coordinate){
        this.weight = weight;
        this.coordinate = coordinate;
   //     System.out.println(this.getValues());
    }

    public abstract void moveObject(float speed);


    protected void setValues(float speed, int weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;

    }

    protected String getValues() {
        String info = "Object speed: " + speed + ". Weight: "+weight +". Color: "+color + ".\n";
        String infoCoordinates  = "Coordinates:\n";

        for(int i=0; i< coordinate.length;i++) {
                infoCoordinates += coordinate[i] + "\n";
        }

        return info+infoCoordinates;
    }
}
