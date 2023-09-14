package ArrayLOPS;

public class Lop27 {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5,6,7,8,9};
        int [] y = {2,4,6,8,9,10};
        System.out.println(SequenceTree(x));
        System.out.println(SequenceTree(y));
    }

    private static boolean SequenceTree(int[] arr) {
        for (int i = 0; i < arr.length-2; i++){
            if (arr[i+1]-arr[i]==1 && arr[i+2]-arr[i+1]==1){
                return true;
            }
        }
        return false;
    }
}
