package Exceptions;

public class RuntimeError {
    public static void main(String[] args) {
        go();

           //runtime error
    }
    public static void go(){
        System.out.println("Going..");
        go();
    }
}
