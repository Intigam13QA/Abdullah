package Abstraction;

public abstract class Bird extends Animal{


    @Override
    public void breathe() {
        System.out.println("Bird id breathing");
    }
    public abstract void fly();
}
