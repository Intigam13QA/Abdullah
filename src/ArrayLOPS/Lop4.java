package ArrayLOPS;

public class Lop4 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int [] y = {5,11,2};
        int [] z = {7,0,0};
        int [] a = {3,-2,10,4};


        System.out.println(SumOfArrays(x));
        System.out.println(SumOfArrays(y));
        System.out.println(SumOfArrays(z));
        System.out.println(SumOfArrays(a));

    }

    private static int SumOfArrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
       sum=sum+arr[i];


        }

        return sum;
    }
}
