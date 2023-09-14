package Encapsulation;

public class KomunalTest {
    public static void main(String[] args) {
        Kamunal k = new Kamunal(331, 250, 100);
       int sum = k.getGas() + k.getElectric() + k.getWater();
        System.out.println(sum);

    }
}
