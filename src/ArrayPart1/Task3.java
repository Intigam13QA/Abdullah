package ArrayPart1;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int rm1 = rm.nextInt(((40000 - 20000) + 1) + 20000);
        int rm2 = rm.nextInt(((80000 - 50000) + 1) + 50000);
        int rm3 = rm.nextInt(((150000 - 100000) + 1) + 100000);

        System.out.println("Enter your luckly number");
        int index = sc.nextInt();
        String[] cars = new String[6];
        cars[0] = "Honda";
        cars[1] = "BMW";
        cars[2] = "Hunday";
        cars[3] = "Jip";
        cars[4] = "Toyoto";
        cars[5] = "Zapi";

        if (index == 0 || index == 1) {
            System.out.println("Your car is " + cars[index] + " and price is " + rm1);
        } else if (index == 2 || index == 3) {
            System.out.println("Your car is " + cars[index] + " and price is " + rm2);
        } else {
            System.out.println("Your car is " + cars[index] + " and price is " + rm3);
        }

    }
}
