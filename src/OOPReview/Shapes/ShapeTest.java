package OOPReview.Shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        System.out.println(s.type);
        Shape d = new Diamond();
        d.draw();
        System.out.println(d.type);
        Shape sq = new Square();
        ((Square)sq).draw();
        System.out.println(sq.type);
        ((Square)sq).squareMethod();

        Object os = new Shape();


    }
}
