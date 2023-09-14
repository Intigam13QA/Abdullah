package ArrayPart2;

public class ArrayLop1 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6};
        System.out.println(fitstLast6(x));

    }

    public static boolean fitstLast6(int[] arr){
        if (arr.length<1){
            return false;
        }
        if (arr[0]==6 || arr[arr.length-1]==6){
            return true;
        }
        return false;
    }
}
