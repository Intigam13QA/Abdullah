package ClassObj2;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ente your Bithday date: ");

        int BithDay = sc.nextInt();
        int curentYear = 2022;
        int retirementage = 63;
        int old = curentYear - BithDay;
        int demand = retirementage - old;
        if (old >= retirementage) {
            System.out.println("You are suitable for retirement scholarship");
        } else {
            System.out.println("You need " + demand + " years more experience");
        }

    }

}
