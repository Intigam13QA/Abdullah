package Constracror;

public class Light {
    int noOfWatts;
    boolean indicator;
    String location;

    public Light(){
        this(0,false);
        System.out.println("Returing from constructor N 1");

    }
    public Light(int light, boolean ind){
        this(light,ind, "X");
        System.out.println("Returing from constructor N 2");

    }

    public Light(int noOfWatts, boolean indicator, String location) {
        this.noOfWatts = noOfWatts;
        this.indicator = indicator;
        this.location = location;
        System.out.println("Returing from constructor N 3");
    }
}
