package ArrayLOPS;

public class Lop22 {
    public static void main(String[] args) {
        int [] x = {1,4,1,1};
        int [] y = {1,4,1,4,4};
        System.out.println(numbersOneFour(x));
        System.out.println(numbersOneFour(y));
    }

    private static boolean numbersOneFour(int[] arr) {
        int counter1=0;
        int counter4=0;
        for (int value :arr){
            if (value==1){
                counter1++;
            }
            if (value==4){
                counter4++;
            }
        }
        if (counter1>counter4){
            return true;
        }
        return false;
    }
}
