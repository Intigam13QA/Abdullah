package Exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        String str = "Selenium";
        try {
            System.out.println(str.length());
            System.out.println(str.charAt(100));
        }catch (Exception e){
            System.out.println("Enter correct Index");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());

        }finally {
           //                                            System.exit(0);
            System.out.println("Finally Block");

        }
        System.out.println("Bye...");
    }
}
