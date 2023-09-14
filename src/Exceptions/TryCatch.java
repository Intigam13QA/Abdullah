package Exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try{
            String str = "JAVA";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(5));
            System.out.println(str.charAt(1));
        }catch (Exception e){
            System.out.println("Exception happened in try block and was caught");
            e.getStackTrace();
        }
        System.out.println("After catching error");
    }
}
