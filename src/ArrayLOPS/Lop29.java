package ArrayLOPS;

import java.util.Arrays;

public class Lop29 {
    public static void main(String[] args) {
        int[] x = {2, 10, 3, 4, 20, 5};
        System.out.println(Arrays.toString(multipleTen(x)));
    }

    private static int[] multipleTen(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0) {
                for (int j = i + 1; j < arr.length && arr[j] % 10 != 0; j++) {
                    arr[j] = arr[i];
                }
            }


        }
        return arr;
    }
}
