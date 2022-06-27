package lesson12OOPClasses;

public class Truck extends Transport {
    private boolean isLoaded;
    public Truck(int weight,byte[] coordinate){
        super(weight,coordinate);
    }



    public void setLoaded(boolean loaded){
        isLoaded = loaded;
    }
    public Truck(int weight,byte[] coordinate, boolean isLoaded){
        super(weight,coordinate);
        this.isLoaded = isLoaded;
    }
    @Override
    public void moveObject(float speed) {
        System.out.println("Object dvigaetsya so skorostyu: "+speed);

    }

    public void setValues(float speed, int weight, String color, byte[] coordinate,boolean isLoaded) {
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
        System.out.println("2 metod");
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public String getLoaded(){
        if(isLoaded==true)
            return "Zagrujen!";
        else{
            return "Pusto!";
        }
    }
}
