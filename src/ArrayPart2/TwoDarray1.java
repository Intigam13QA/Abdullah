package ArrayPart2;

import java.util.Arrays;

public class TwoDarray1 {
    public static void main(String[] args) {

        int[][] num = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < num.length; i++) {
            for (int i1 = 0; i1 < num[i].length; i1++) {
                System.out.println(num[i][i1]);
            }

        }
    }
}

