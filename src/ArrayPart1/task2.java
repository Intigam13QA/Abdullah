package ArrayPart1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day number:");
        int day = sc.nextInt();
        String myarray[] = new String[7];
        myarray[0] = "Mounday";
        myarray[1] = "Tuesay";
        myarray[2] = "Wenthday";
        myarray[3] = "Thothday";
        myarray[4] = "Freday";
        myarray[5] = "Satuday";
        myarray[6] = "Sunday";
        System.out.println("Your day is: " + myarray[day]);
    }
}
