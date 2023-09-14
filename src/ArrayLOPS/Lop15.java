package ArrayLOPS;

import java.util.Arrays;

public class Lop15 {
    public static void main(String[] args) {
        int [] x ={1,2,7,90};
        System.out.println(Arrays.toString(swap(x)));
    }

    private static int[] swap(int[] arr) {

        int temp =0;
        temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;

        return arr;
    }
}
