package ArrayLOPS;

import java.util.Arrays;

public class Lop6 {
    public static void main(String[] args) {
        int[] x = {1, 3, 2};
        int[] y = {11, 5, 9};
        int[] z = {110, 58, 1200, 5, 65, -4};
        /*System.out.println(Arrays.toString(FinfBigElement(x)));
        System.out.println(Arrays.toString(FinfBigElement(y)));
        System.out.println(Arrays.toString(FinfBigElement(z)));*/

        System.out.println(Arrays.toString(maxEnd(x)));
        System.out.println(Arrays.toString(maxEnd(y)));
        System.out.println(Arrays.toString(maxEnd(z)));


    }

    private static int[] maxEnd(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] > max) {
                max = a[i + 1];
            }
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = max;



        }

    /*private static int [] FinfBigElement(int [] arr) {
        for (int i = 0; i <arr.length;i++){
        }
        Arrays.sort(arr);
        for (int i = 0; i<arr.length;i++){
            arr [i]=arr[arr.length-1];
        }

        return arr;*/
        return a;
    }
}
