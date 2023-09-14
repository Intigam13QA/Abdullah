package Polymorphism;

public class InstanceOf {
    public static void main(String[] args) {
        Shape sp = new Triangle();
        if (sp instanceof Triangle){
            System.out.println("Triangle");
        } else if (sp instanceof Square) {
            System.out.println("Square");
        } else {
            System.out.println("Circle");
        }
    }

    
}
