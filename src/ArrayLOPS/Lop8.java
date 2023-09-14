package ArrayLOPS;

public class Lop8 {
    public static void main(String[] args) {
        int [] x = {1,2,3};
        int [] y = {4,5};
        int [] z = {3,4};
        System.out.println(trueFalse(x));
        System.out.println(trueFalse(y));
        System.out.println(trueFalse(z));
    }

    private static String trueFalse(int[] arr) {
        for (int i =0; i<arr.length; i++){
            if (arr[i]==2 || arr[i]==3){
                return "true";
            }
        }
        return "false";
    }
}
