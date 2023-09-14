package Abstraction;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Dog id breathing");
    }

    @Override
    public void navigator(String nav) {

    }
}
