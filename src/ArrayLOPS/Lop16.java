package ArrayLOPS;

public class Lop16 {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5,6,7,8};
        int [] y = {2,2,0};
        evennumbers(x);
        evennumbers(y);
    }

    private static void evennumbers(int[] arr) {
        int counter= 0;
        for (int value : arr){
            if (value%2==0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
