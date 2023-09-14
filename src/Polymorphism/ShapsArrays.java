package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapsArrays {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[4];
        shapes[0] = new Square();
        shapes[1] = new Circle();
        shapes[2] = new Triangle();
        shapes[3] = new Shape();
        System.out.println(shapes[0].toString());
        for (Shape sp : shapes){
            System.out.println(".............");
            System.out.println(sp.getClass());
            System.out.println();
            System.out.println(sp.getClass().getName());
            System.out.println();
            System.out.println(sp.getClass().getSimpleName());
        }

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Square());
        shapeList.add(new Circle());


    }
}
