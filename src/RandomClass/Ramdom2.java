package RandomClass;

import java.util.*;

public class Ramdom2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;
        int userAnswer;
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        num1 = rn.nextInt(100);
        num2 = rn.nextInt(100);


        sum = num1 + num2;
        System.out.println("Try to find following problem");
        System.out.print(num1+" + "+num2+" = ?");
        userAnswer = sc.nextInt();
        if (userAnswer==sum){
            System.out.println("You got it.");
        }else {
            System.out.println("Wrong answer. The true one is: "+sum);
        }


    }
}
