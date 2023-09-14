package ArrayLOPS;

import java.util.Arrays;
import java.util.Scanner;

public class Lop23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int [] x = new int[sc.nextInt()];
        System.out.println(Arrays.toString(fizzArray(x)));
    }

    static int[] fizzArray(int[] arr) {
        arr[0]=0;
        for (int i =0; i<arr.length;i++){
            arr[i]=i;

        }
        return arr;
    }
}
