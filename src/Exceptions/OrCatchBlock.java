package Exceptions;

import java.util.Locale;

public class OrCatchBlock {
    public static void main(String[] args) {
        String str = "abc";
        try {
            System.out.println(str.toUpperCase());
        }catch ( IllegalArgumentException | NullPointerException e){
            // Exception type can nat be sub-parent types
            e.printStackTrace();

        }
    }
}
