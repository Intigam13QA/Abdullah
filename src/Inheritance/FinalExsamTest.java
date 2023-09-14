package Inheritance;

import java.util.Scanner;

public class FinalExsamTest {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Questioun numbers");
        num1=sc.nextInt();
        System.out.println("Enter your mised number of question");
        num2=sc.nextInt();
        FinalExsam f = new FinalExsam(num1,num2);
        System.out.println(" the grade for the exsam result is  " +f.getGrade());

    }
}
