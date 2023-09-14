package Interface;

public interface Electrik {

    public static final boolean hasBatteries = true;
    boolean hasBatteries2 = false; // static final
    public abstract void charge();

    void charge2();

    public default void methodA(){

    }

    public static void methodB(){

    }
}
