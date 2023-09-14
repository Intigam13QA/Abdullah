package ArrayLOPS;

import java.util.Arrays;

public class Lop14 {
    public static void main(String[] args) {
        int [] x = {1,2};
        int [] y = {3,4,5,6,7,8,9};
        container(x,y);
    }

    private static void container(int[] arr, int[] ar) {

        int [] newa = new int[arr.length+ ar.length];


        for (int i =0; i<arr.length; i++){
            newa[i]=arr[i];


        }


        for (int j =arr.length; j<newa.length; j++){
            newa[j]=ar[j-arr.length];


        }
        System.out.println(Arrays.toString(newa));


    }
}
