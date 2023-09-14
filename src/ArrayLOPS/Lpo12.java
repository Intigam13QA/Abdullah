package ArrayLOPS;

public class Lpo12 {
    public static void main(String[] args) {
        int [] x = {2,3,4,5};
        int [] y = {4,5};
        int [] a = {1};
        int [] b = {7,2,1};
        System.out.println(ReturnOne(x,y));
        System.out.println(ReturnOne(a,b));
    }

    private static int ReturnOne(int[] ar, int[] arr) {
        int counter = 0;
        /*for (int i =0; i<ar.length; i++){
            if(ar[0]==1){
                counter++;
                break;
            }

            }
        for (int i =0; i<arr.length; i++){
            if(arr[0]==1){
                counter++;
                break;
            }
            return counter;
    }
        return counter;*/
        if(arr[0]==1) {
            counter++;
        }
        if(ar[0]==1) {
            counter++;
        }
        return counter;
    }
}
