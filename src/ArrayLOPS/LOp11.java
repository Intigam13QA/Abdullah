package ArrayLOPS;

import java.util.Arrays;

public class LOp11 {
    public static void main(String[] args) {
        int [] x = {1,2,3};
        int [] y = {1,2,1};
        int [] z = {2,3,5};
        int [] a = {2,3,5,6,7,3,2};
        System.out.println(Arrays.toString(printZero(x)));
        System.out.println(Arrays.toString(printZero(y)));
        System.out.println(Arrays.toString(printZero(z)));
        System.out.println(Arrays.toString(printZero(a)));
    }

    private static int [] printZero(int[] arr) {

        for (int i =0; i<arr.length-1;i++){
            if (arr[i]==2 && arr[i+1]==3){
                arr[i+1]=0;
            }
        }
        return arr;
    }
}
