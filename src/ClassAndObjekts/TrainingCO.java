

package ClassAndObjekts;

import java.util.Scanner;

public class TrainingCO {
    public static void main(String[] args) {

        Scanner train = new Scanner(System.in);
        System.out.println("Enter a number between 1-99");
        int attemp = 0;
        do {
            int useramount = train.nextInt();
            if (useramount >= 1 && useramount <= 99) {
                train(useramount);
                break;
            } else {
                attemp++;
                if (attemp == 3) {
                    System.out.println("You lost your last chans");
                    break;
                } else {
                    System.out.println("Try again");
                }
            }


        } while (true);


    }

    private static void train(int useramount) {
        int firstamount = useramount;
        int pen = useramount / 10;
        useramount = useramount % 10;
        int book = useramount / 5;
        useramount = useramount % 5;
        int table = useramount / 3;
        useramount = useramount % 3;
        int car = useramount;

        System.out.println("Your first amount: " + firstamount + " Pen: " + pen + " Book: " + book + " Table: " + table + " Car:");

    }


}

