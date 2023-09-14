package StringManuplation1;

import java.util.Scanner;

public class UsernamePassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = sc.nextLine();
        System.out.println("Enter your pasword");
        String pasword = sc.nextLine();
        String usernameinSystem = "Abdullah";
        String passwordinSystem = "12345";
        do {

        if (username.equals("") && pasword.equals("")) {
            System.out.println("User and last name cannot be blank");
        } else if (username.equals("") && !pasword.equals("")) {
            System.out.println("Username cannot be blank");
        } else if (!username.equals("") && pasword.equals("")) {
            System.out.println("Password cannot be blank");
        } else if (!username.equals(usernameinSystem) || !pasword.equals(passwordinSystem)) {
            System.out.println("Both are Invalid");
            System.out.println("Try again");
        } else {
            System.out.println("User logged successfully");
        }
        }while (true);
    }
}