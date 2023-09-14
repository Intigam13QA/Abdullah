package OOPReview.Shapes;

import java.util.List;

public class ShapeManager {
        public static Shape buildShape(String type){
            Shape shape = null;
            switch (type.toString()){
                case "shape":
                    shape = new Shape();
                    break;
                case "square":
                    shape = new Square();
                    break;
                case "diamond":
                    shape = new Diamond();
                    break;
            }
            return shape;
        }
        public static void drawSquare( Square squareObjec){
            squareObjec.draw();
        }
        public static void drawShape(Shape shapeObject){
            shapeObject.draw();
        }
        public static void drawDiamond(Diamond diamondobject){
            diamondobject.draw();
        }
        public static void drawShape(List<Shape> shapeList){
            for (Shape each : shapeList){
                each.draw();
            }
        }
    }

