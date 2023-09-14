package ArrayPart2;

public class ArrayLop2 {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,1};
        int [] y = {2,3,4,5};
        int [] z = {};
        System.out.println(checkEquality(x));
        System.out.println(checkEquality(y));
        System.out.println(checkEquality(z));
    }

    private static String  checkEquality(int[] arr) {
        if (!(arr.length >1)){
            return "not a valid array";
        }
        if (arr[0]==arr[arr.length-1]){
            return "true";
        }
        return "false";
    }

}
