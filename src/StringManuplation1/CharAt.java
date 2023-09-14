package StringManuplation1;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        String name = "Computer";
        System.out.println(name.length());


        System.out.println(name.charAt(6));

        String name1 = "Apple";
        if (name1.charAt(0) == 'A') {
            System.out.println("First charakter is A");
        } else {
            System.out.println("First charakter is not A");
        }
        String name2 = "CiviC";
        if (name2.charAt(0) == 'C' && name2.charAt(4) == 'C') {
            System.out.println("The same");
        } else {
            System.out.println("Not the same");

        }
        String name3 = "Abdullah";
        char lastchar = name3.charAt(name3.length() - 1);
        System.out.println("Last char " + lastchar);


        String name4 = "Cybertec School";
        for (int i = 0; i < name4.length(); i++) {
            System.out.println(name4.charAt(i));


        }
        String emoji = ":[";
        if (emoji.length() == 2) {
            if (emoji.charAt(0) == ':') {
                switch (emoji) {
                    case ":)":
                        System.out.println("Smile");
                        break;
                    case ":(":
                        System.out.println("Sad");
                        break;
                    case ":/":
                        System.out.println("Upset");
                        break;
                    case ":p":
                        System.out.println("Playful");
                    default:
                        System.out.println("Invalid");
                }
            } else {
                if (emoji.charAt(0) == ';') {
                    switch (emoji) {
                        case ";)":
                            System.out.println("Wink");
                            break;
                        case ";0":
                            System.out.println("Surpirised");
                            break;
                        default:
                            System.out.println("Invalid");
                    }
                }

            }
        } else {
            System.out.println("Invalid emoji");
        }


        String word = "abcdabcdabcd";
        char mychar = 'd';
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == mychar) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println();


        String abc = "Abdullah";
        for (int i = 0; i < abc.length(); i++) {
            char letter = abc.charAt(i);
            if (letter == 'a' || letter == 'i' || letter == 'o' || letter == 'e' || letter == 'u') {
                System.out.print(letter);
                if (letter!= abc.charAt(abc.length())){
                    System.out.print(",");
                }

            }

        }



    }
}

