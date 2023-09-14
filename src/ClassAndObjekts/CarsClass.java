package ClassAndObjekts;

public class CarsClass {
    String mark;
    String model;
    String coler;
    int currntspeed;

    public void printCatInfo() {
        String info = "Car mark[" + mark + "],model[" + model + "],color[" + coler + "],currentspeed[" + currntspeed + "]";
        System.out.println(info);
    }

    public void drive() {
        System.out.println(mark + " " + model + " is driving..");
    }
    public void showCurintLimit(int currntlimit){
        if (currntspeed<currntlimit){
            System.out.println("Keep continue");
        }else{
            System.out.println("Reduce your current speed "+ currntspeed+ " to under "+ currntlimit);
        }
    }

    public void accelerate(int mph) {
        currntspeed = currntspeed + mph;
    }

}
