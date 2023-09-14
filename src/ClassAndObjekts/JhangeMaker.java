package ClassAndObjekts;

import java.util.Scanner;

public class JhangeMaker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1-99");

        int attemp = 0;

        do {
            int useraccount = sc.nextInt();

            if (useraccount >= 1 && useraccount <= 99) {
                changemarker(useraccount);
                break;
            } else {
                attemp++;
                if (attemp == 3) {
                    System.out.println("Invalid, You lost your last chans");
                    break;

                }else {
                    System.out.println("Try again");
                }
            }
        } while (true);

    }

    public static void changemarker(int account) {
        int originalaccount = account;

        int pen = account / 25;
        account = account % 25;
        int table = account / 5;
        account = account % 5;
        int book = account / 3;
        account = account % 3;
        int soup = account;
        System.out.println("Your originalaccount " + originalaccount + ", pen: " + pen + " table: " + table + " book: " + book + " soup " + soup);

    }
}
