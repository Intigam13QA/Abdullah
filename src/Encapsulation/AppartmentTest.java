package Encapsulation;

public class AppartmentTest {
    public static void main(String[] args) {
        Appartment a = new Appartment(1500, 110, 100);
        int sumA = a.costOfHome + a.internet + a.gardian;
        System.out.println(sumA);
    }
}
