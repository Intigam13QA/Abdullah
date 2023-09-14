package InheritanceTwo;

public class Car extends Vehicle {
    int maxSpeed = 180;
    public void display(){
        System.out.println("Max Speed is:"+super.maxSpeed);
        System.out.println("Max Speed is "+ maxSpeed);
    }
}
