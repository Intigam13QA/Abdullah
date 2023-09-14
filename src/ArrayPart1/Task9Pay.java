package ArrayPart1;

import java.util.Scanner;

public class Task9Pay {
    public static void main(String[] args) {
        int employee = 5;
        Scanner sc = new Scanner(System.in);
        int[] hours = new int[employee];
        System.out.println("Enter " + employee + " workers daily working hours");
        for (int i = 0; i < hours.length; i++) {
            hours[i] = sc.nextInt();
        }
        System.out.println("Enter equal wage");
        int[] salary = new int[employee];
        for (int i = 0; i < hours.length; i++) {
            salary[i] = sc.nextInt();
        }
        int[] workersGross = new int[employee];
        for (int i = 0; i < workersGross.length; i++) {
            workersGross[i] = hours[i] * salary[i];

            System.out.println("Employee " + (i + 1) + " get: " + workersGross[i] + " $");
        }


    }
}
