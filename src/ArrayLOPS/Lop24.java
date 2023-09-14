package ArrayLOPS;

public class Lop24 {
    public static void main(String[] args) {
        int [] x = {1,2,3,1,3,3,2,4};
        int a = 3;
        System.out.println(findTwoequalNum(x,a));
    }

    private static boolean findTwoequalNum(int[] arr, int a) {
        int counter = 0;
        for (int value : arr){
            if (value==a){
                counter++;
                if (counter==2){
                    return true;
                }
            }
        }
        return false;
    }
}
