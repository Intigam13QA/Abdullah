package Interface;

public abstract class ElectricCar {
    private String model;
    private double price;
    private String color;

    public ElectricCar(String model,double price,String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }
    public abstract void start();
    public abstract void charge();
    public abstract void drive();

    public void stop(){
        System.out.println("Electrik car is stoping by pushed the break");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
