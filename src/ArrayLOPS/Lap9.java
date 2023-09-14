package ArrayLOPS;

import java.util.Arrays;

public class Lap9 {
    public static void main(String[] args) {
        int [] x = {4,5,6};
        System.out.println(Arrays.toString(Doublenew(x)));
    }

    private static int[] Doublenew(int[] arr) {
        int [] ar = new int[arr.length*2];
        ar [ar.length-1]= arr[arr.length-1];
        return ar;
    }
}
