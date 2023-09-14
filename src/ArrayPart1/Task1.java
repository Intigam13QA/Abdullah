package ArrayPart1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from 0-11");
        int num = sc.nextInt();
        String mounth []= new String[12];
        mounth[0] = "January";
        mounth[1] = "February";
        mounth[2] = "March";
        mounth[3] = "Aprel";
        mounth[4] = "May";
        mounth[5] = "June";
        mounth[6] = "July";
        mounth[7] = "Augoste";
        mounth[8] = "September";
        mounth[9] = "October";
        mounth[10] = "November";
        mounth[11] = "Decenber";


        System.out.println(mounth[num]);
    }
}
