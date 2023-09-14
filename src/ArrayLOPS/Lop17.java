package ArrayLOPS;

import java.util.Arrays;

public class Lop17 {
    public static void main(String[] args) {
        int[] x = {1, 2, 4, 6, 7,10};
        counterBigSmall(x);

    }

    private static void counterBigSmall(int[] arr) {
        int max = 0;

        for (int i = 0; i <arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            }
        int min = max;
        for (int i = 0; i <arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
           /* Arrays.sort(arr);
            min=arr[0];
            max=arr[arr.length-1];*/

        System.out.println(max-min);
    }
}
