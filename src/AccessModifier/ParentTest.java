package AccessModifier;

public class ParentTest {
    public static void main(String[] args) {
        Child s = new Child();
        Parent p = new Parent();

        System.out.println("Value of x before increment "+p.x);
        System.out.println("Value of x before increment "+s.x);

        s.increment();
        p.increment();
        System.out.println("Value of x after increment "+s.x);
        System.out.println("Value of x after increment"+p.x);
        System.out.println();
        s.increment();
        p.increment();
        System.out.println("Value of x after increment "+s.x);
        System.out.println("Value of x after increment"+p.x);

    }
}
