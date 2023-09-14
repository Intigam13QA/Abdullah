package Exceptions;

import java.util.Locale;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int num = 4/0;
           String name = null;
            System.out.println(name.toUpperCase());
            int [] n = {12,34};
            System.out.println(n[2]);

        }catch (ArithmeticException e){
            System.out.println("Arithmetic ecxeption happened");
        }catch (NullPointerException e){
            System.out.println("NullPointer ecxeption happened");
        }catch (RuntimeException e){
           e.printStackTrace();
        }
    }
}
