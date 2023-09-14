package Exceptions;

import java.util.Locale;

public class NullPointer extends Throwable {
    static String name;

    public static void main(String[] args) {
        System.out.println(name);

        try {
            System.out.println(name.toUpperCase(Locale.ROOT));
        } catch (NullPointerException e) {

            System.out.println("Nul pointer exception happend");

            System.out.println("Here is the message " + e.getMessage());

            System.out.println("Here is the stack trace "+e.getStackTrace());
             e.getStackTrace();
        }

    }
}
