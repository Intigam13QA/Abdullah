package RandomClass;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random rm = new Random();
        System.out.println(rm.nextDouble());
        System.out.println(rm.nextInt());
        System.out.println(rm.nextInt(100)-10);
        System.out.println(rm.nextBoolean());
        System.out.println(rm.nextLong());
        System.out.println(rm.nextGaussian());
    }
}
