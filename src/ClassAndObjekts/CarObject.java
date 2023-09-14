package ClassAndObjekts;

public class CarObject {
    public static void main(String[] args) {


        CarsClass car1 = new CarsClass();
        CarsClass car2 = new CarsClass();
        CarsClass car3 = new CarsClass();
        car1.mark = "bmw";
        car1.model = "qwe";
        car1.currntspeed = 799;
        car1.coler = "green";

        System.out.println(car1.mark);

        car1.printCatInfo();
        car1.drive();
        car1.accelerate(1);
        car1.showCurintLimit(800);
        System.out.println(car1.currntspeed);
    }
}
