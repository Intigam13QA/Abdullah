package RandomClass;

import java.util.Random;

public class Random4 {
    public static void main(String[] args) {
        Random rm = new Random();
        for (int i = 0; i < 10; i++) {
            if (rm.nextInt(3) == 0) {
                System.out.println("Tails");
            } else if (rm.nextInt(3) == 1) {
                System.out.println("Heads");
            } else {
                System.out.println("Abdu");
            }
        }

    }
}
