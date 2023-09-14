package ArrayPart1;

import java.util.Scanner;

public class CarFind12 {
    public static void main(String[] args) {
        System.out.println(trueCare(4,"Honda"));

    }


    private static boolean trueCare(int valu, String carname) {
        for (String car : carName(valu)){
            if (car.equalsIgnoreCase("honda")){
                return true;
            }

        }
        return false;


    }

    private static String[] carName(int arraysize) {
        Scanner sc = new Scanner(System.in);
        String[] myarray = new String[arraysize];
        for (int i = 0; i < myarray.length; i++) {
            System.out.println("Enter cae #:" + (i + 1));
            myarray[i] = sc.nextLine();

        }
        return myarray;


    }

}
