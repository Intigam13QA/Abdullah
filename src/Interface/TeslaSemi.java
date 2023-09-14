package Interface;

public class TeslaSemi extends ElectricTrack{
    private double engineSize;
    public TeslaSemi(String model, double price, String color,double engineSize) {
        super(model, price, color);
        this.engineSize = engineSize;
    }
    public void start(){
        System.out.println("TeslaSemi- start truck by pressing a button");
    }
    public void charge(){
        System.out.println("TeslaSemi plugin charge for 30 minutes");
    }
    public void drive(){
        System.out.println("TeslaSemi - truck is driving with load");
    }

    public void load(String item){
        System.out.println("TeslaSemi load "+ item+ " by lowering the truck and opening door");
    }

}
