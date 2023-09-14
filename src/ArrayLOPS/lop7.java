package ArrayLOPS;

import java.util.Arrays;

public class lop7 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int[] y = {};
        System.out.println(Arrays.toString(firstAndEnd(x, y)));
    }

    private static int[] firstAndEnd(int[] ar1, int[] ar2) {
        ar2 = new int[2];
        ar2 [0] = ar1[0];
        ar2 [1] = ar1[ar1.length-1];

        return ar2;
    }

}
