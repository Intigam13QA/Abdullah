package ArrayLOPS;

public class Lop26 {
    public static void main(String[] args) {
        int [] x = {1,3,5,4,3};
        int [] y = {2,4,6,8,7,5};
        int [] z ={2,3,4,5,7,8,3};
        System.out.println(EvenOddNums(x));
        System.out.println(EvenOddNums(y));
        System.out.println(EvenOddNums(z));
    }

    private static boolean EvenOddNums(int[] arr) {
        for (int i = 0; i<arr.length-2; i++) {
            if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0 && arr[i + 2] % 2 == 0) {
                return true;
            }
        }
        for (int i = 0; i<arr.length-2; i++){
            if (arr[i]%2==1 && arr[i+1]%2==1 && arr[i+2]%2==1){
                return true;
            }
        }
        return false;
    }
}
