package Abstraction;

public class Parrot extends Bird{
    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void navigator(String nav) {

    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
