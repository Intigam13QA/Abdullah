package ArrayPart1;

import java.util.Random;

public class Task11Return {
    public static void main(String[] args) {
        getarray(5);

    }

    private static void getarray(int numbers) {
        for (int value : createArray(numbers)) {
            System.out.println(value);
        }


    }

    private static int[] createArray(int arraysize) {
        Random rm = new Random();
        int myarray[] = new int[arraysize];
        for (int i = 0; i < myarray.length; i++) {
            myarray[i] = rm.nextInt(100);

        }
        return myarray;
    }
}
