package RandomClass;

import java.util.*;

public class Random3 {
    public static void main(String[] args) {


        int num1;
        int num2;
        String userAnswer = "y";


        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        while (userAnswer.equalsIgnoreCase("y")) {
            System.out.println("rolling the duce...");
            num1 = rn.nextInt(6) + 1;
            num2 = rn.nextInt(6) + 1;
            System.out.println("Their values are: " + num1 + " " + num2);
            System.out.print("Roll them again (y=yes): ");
            userAnswer = sc.nextLine();

        }



        /*do {*/
        /*System.out.println("rolling the duce...");
        System.out.println("Their values are: " + num1 + " " + num2);
        System.out.print("Roll them again (y=yes): ");


                userAnswer=sc.nextLine();
            if (userAnswer == "y" || userAnswer == "Y") {
                System.out.println("rolling the duce...");
                System.out.println("Their values are: " + num1 + " " + num2);
                System.out.print("Roll them again (y=yes): ");
            } else if (userAnswer == "n" || userAnswer=="N") {
                break;

            }

        } while (true);*/


    }
}
