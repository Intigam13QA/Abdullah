package ArrayLOPS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lop28 {
    public static void main(String[] args) {
        int a =5;
        int b =10;
        int [] x = {a,b};
        System.out.println(Arrays.toString(fizzArray(x)));
    }

    private static int[] fizzArray(int[] arr) {
        for (int i =0; i <arr.length-1-arr[0]-1; i++){
            arr[i+1]=arr[0]+1;
        }
        return arr;
    }
}
