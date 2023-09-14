package ArrayLOPS;

import java.util.Arrays;

public class Lop20 {
    public static void main(String[] args) {
        int [] x = {1,2,2,3,4};
        int [] y = {2,1,2};
        System.out.println((Countaintwo(x)));
        System.out.println((Countaintwo(y)));
    }

    private static boolean Countaintwo(int[] arr) {
        for (int i= 0; i<arr.length-1; i++){
            if (arr[i]==2 && arr[i+1]==2){
                return true;
            }
        }
        return false;
    }

}
