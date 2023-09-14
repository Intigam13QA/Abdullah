package ClassAndObjekts.test;

public class Main {
    public static void main(String[] args) {
//        Human ali = new Human("Ali", "Armenia", 33);
//        Human abdulla = new Human("Abdullah", "Azerbaijanian", 25);
//        System.out.println(abdulla.name);
//        System.out.println(abdulla.nation);
//        System.out.println(abdulla.age);

        Computer computer = new Computer( "Apple","Black", 400);
        System.out.println(computer.model);
        System.out.println(computer.color);
        System.out.println(computer.price);
    }
}
