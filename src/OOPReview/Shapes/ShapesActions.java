package OOPReview.Shapes;
import java.util.ArrayList;
import java.util.List;

import static OOPReview.Shapes.ShapeManager.*;
public class ShapesActions {
    public static void main(String[] args) {
      drawSquare((Square)buildShape("square"));
      drawShape(buildShape("shape"));
        System.out.println("________________________");

        List<Shape> myList = new ArrayList<>();
        myList.add(new Shape());
        myList.add(new Square());
        myList.add(new Diamond());


    }
}
