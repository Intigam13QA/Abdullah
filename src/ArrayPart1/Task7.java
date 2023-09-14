package ArrayPart1;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {


        Random rm = new Random();
        int[] numbers = new int[10];
        /*numbers[0] = rm.nextInt(100);
        numbers[0] = rm.nextInt(100);
        numbers[0] = rm.nextInt(100);
        numbers[0] = rm.nextInt(100);
        numbers[0] = rm.nextInt(100);
        numbers[0] = rm.nextInt(100);
        numbers[0] = rm.nextInt(100);
        numbers[0] = rm.nextInt(100);
        numbers[0] = rm.nextInt(100);
        numbers[0] = rm.nextInt(100);*/


        for (int i = 0; i < numbers.length; i++){
            numbers[i]=rm.nextInt(100);
            System.out.println(numbers[i]);

        }
        System.out.println(Arrays.toString(numbers));




    }
}
