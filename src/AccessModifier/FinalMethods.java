package AccessModifier;

public class FinalMethods {

    public /*final*/ void m1() {
        System.out.println("m1() ");
    }

    public static /*final*/ void staticMethod(String word) {
        System.out.println("Static Method");

    }
}

class Sub extends FinalMethods {
    public void m1() {
        System.out.println("M1() in Sub class");
    }

    public static void staticMethod(String word) {
        System.out.println("Static Method in Sub class");


    }
}
