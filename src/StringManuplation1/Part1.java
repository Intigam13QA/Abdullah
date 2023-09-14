package StringManuplation1;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        String name = "Abdullah";
        System.out.println(name.length());
        int x = name.length();
        System.out.println(x*10);

        String str = new String("Abdullah");
        System.out.println(str.length());

        Scanner str1 = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String str2 = str1.nextLine();
        System.out.println(str2.length());



    }
}
