package Constracror;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 5000);
        System.out.println("Main "+c1.name);

        Car c2 = new Car("JIP",3456,2022, "Black");
        System.out.println("Main "+c2.name+" "+ c2.mile+" "+ c2.year+" " +c2.color);

        Car c3 = new Car();
        System.out.println("Main "+c3.name+" "+ c3.mile+" "+ c3.year+" " +c3.color);

    }
}
