package Exceptions;

public class ThrowandThrows {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //throw new RuntimeException("This is some exception");
        sleep3(2);

    }
    public static void sleep(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
        System.out.println(seconds);
    }
    public static void sleep2(int seconds) throws InterruptedException {
        sleep(seconds);
    }
    public static void sleep3(int seconds){
        try {
            sleep2(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
