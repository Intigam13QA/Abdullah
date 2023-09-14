package ArrayLOPS;

import java.util.Arrays;

public class Lop5 {
    public static void main(String[] args) {
        int[] x = {17,23,45,67};

        System.out.println(Arrays.toString(RotatedLeft(x)));


    }

    private static int[] RotatedLeft(int[] arr1) {

        int x = arr1[0];

        for (int i = 0; i <arr1.length-1; i++) {
            arr1[i]=arr1[i+1];

        }
        arr1[arr1.length-1]=x;


        return arr1;
    }
}
