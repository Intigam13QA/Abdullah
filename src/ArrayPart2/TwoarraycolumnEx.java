package ArrayPart2;

import java.util.Arrays;

public class TwoarraycolumnEx {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[1];
        array[3] = new int[4];
        array[0][0] = 5;
        array[0][0] = 4;
        array[0] = new int[4];


        System.out.println("----------");
        System.out.println(array[0][0]);

        String[] sr = {"1a", "1A", "A", "a", "@", "2A", "2a","B","b"};
        Arrays.sort(sr);
        System.out.println(Arrays.toString(sr));
    }
}
