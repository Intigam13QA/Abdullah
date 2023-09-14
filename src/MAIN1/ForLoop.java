package MAIN1;
public class ForLoop {
    public static boolean main(String[] args) {
        //Write a for loop that displays the following set of numbers:
        //0,10,20,30,40,50,...1000
        for (int num = 0; num <= 100; num++) {
            System.out.print(num * 10 + ",");
        }
        System.out.println();
        //Write a program that displays all odd numbers between 3-130 in the same line
        for (int oddNum = 3; oddNum < 130; oddNum++) {
            if (oddNum % 2 == 1) {
                System.out.print(oddNum + "-");
            }
        }
        System.out.println();
        //Write a program that displays the number of even numbers between 5 and 50 (included)
        for (int evenNum = 6; evenNum <= 50; evenNum++) {
            if (evenNum % 2 == 0) {
                System.out.print(evenNum + "/");
            }

        }
        System.out.println();
        //Write a while loop that lets the user enter a number. The number should be
        //multiplied by 10, and the result stored in the variable product. The loop should iterate
        // as long as product contains a value less than 100.

        int number = 10;
        while (number <= 10){
            System.out.print( number*10 +" ");
            number++;
        }


        return false;
    }

}
