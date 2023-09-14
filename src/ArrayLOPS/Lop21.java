package ArrayLOPS;

public class Lop21 {
    public static void main(String[] args) {
        int [] x = {1,2,2,2,2,3,4};
        int [] y = {2,4,5,6,2};
        System.out.println(coulculateOnlyTwo(x));
        System.out.println(coulculateOnlyTwo(y));

    }

    private static boolean coulculateOnlyTwo(int[] arr) {
        int counter = 0;
        for (int i = 0; i <arr.length;i++) {
            if (arr[i] == 2) {
                counter = counter + arr[i];

            }
        }
            if (counter==8){
                return true;
            }
        return false;

        }

    }

