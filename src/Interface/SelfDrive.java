package Interface;

public interface SelfDrive {
    void selfDrive();  //public abstract

    public default void methodA(){

    }
    public static void methodB(){  //hiding

    }
}
