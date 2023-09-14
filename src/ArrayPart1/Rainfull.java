package ArrayPart1;

import java.util.Scanner;

public class Rainfull {
    public static void main(String[] args) {
        System.out.println("Please enter in the following rainfall for the months ahead:");
        System.out.println("Month Rainfall (In inches)");
        double rain;
        double counter = 0;
        double min = 0;
        double max = 0;
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < month.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(month[i]);
            rain = sc.nextDouble();
            System.out.println(month[i] + " :" + rain);
            counter = counter + rain;


        }
        System.out.println("The sum of all the rain is:" + counter + " inches");
        System.out.println("The average rainfall was:" + counter / 12 + " inches");


    }
}
