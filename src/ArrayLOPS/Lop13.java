package ArrayLOPS;

import java.util.Arrays;

public class Lop13 {
    public static void main(String[] args) {
        int[] x = {1, 4};
        int[] y = {1, 4};
        equalcase(x, y);
    }

    private static void equalcase(int[] arr, int[] ar) {
        int counter1 = 0;
        int counter2 = 0;
        for (int value : arr) {
            counter1 = counter1 + value;

        }
        for (int value : ar) {
            counter2 = counter2 + value;
        }
        if (counter1 > counter2) {
            System.out.println(Arrays.toString(arr));

        } else if (counter2 > counter1) {
            System.out.println(Arrays.toString(ar));
        } else {
            System.out.println("equal");

        }



    }
}
