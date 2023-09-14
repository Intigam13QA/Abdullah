package ArrayPart1;

public class ArrayCreation {
    public static void main(String[] args) {
        int[] score = new int[4];
        double[] score1 = new double[60];
        boolean[] score2 = new boolean[5];
        String[] score3 = new String[45];

        System.out.println(score[3]);
        System.out.println(score2[2]);
        System.out.println(score3[44]);

        int scoree[] = new int[5];
        scoree[0] = 65;
        scoree[1] = 55;
        scoree[2] = 1;
        scoree[3] = 32;
        scoree[4] = 23;
        System.out.println(scoree[0]);
        System.out.println(scoree[1]);
        System.out.println(scoree[2]);
        System.out.println(scoree[3]);
        System.out.println(scoree[4]);
        int avgscoree = (scoree[0] + scoree[1] + scoree[2] + scoree[3] + scoree[4]) / 5;
        System.out.println(avgscoree);


    }

}

