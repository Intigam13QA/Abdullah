package ArrayLOPS;

public class Lop10 {
    public static void main(String[] args) {
        int [] x = {2,2,2,3,3};
        int [] y = {3,3,3};
        int [] z = {2,22,6};
        int [] a = {3,3};
        System.out.println(thrufalse(x));
        System.out.println(thrufalse(y));
        System.out.println(thrufalse(z));
        System.out.println(thrufalse(a));
    }

    private static boolean thrufalse(int[] arr) {
        int counter1=0;
        int counter2=0;
        for (int value : arr){
            if (value==2){
                counter1++;
            }
            if (value==3 ){
               counter2++;
            }
        }
        if (counter1==2 || counter2==2){
            return true;
        }

        return false;
    }
}
