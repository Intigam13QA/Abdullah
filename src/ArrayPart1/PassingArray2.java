package ArrayPart1;

import java.util.Scanner;

public class PassingArray2 {
    public static void main(String[] args) {
        int numbers [] = new int[4];
        getValues(numbers);
        System.out.println("Here is the numbers you entered:");
        showvalue(numbers);
    }

    private static void showvalue(int[] array) {
        for (int value:array){
            System.out.println(value);
        }
    }

    private static void getValues(int[] array) {
        System.out.println("Enter the serios of "+array.length+" numbers");
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<array.length;i++){
            System.out.println("Enter a value "+(i+1));
            array[i]=sc.nextInt();
        }
    }
}

