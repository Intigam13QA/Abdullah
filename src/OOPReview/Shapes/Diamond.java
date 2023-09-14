package OOPReview.Shapes;

public class Diamond extends Shape{
    public Diamond(){
        type = "Diamond";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Diamond");
    }
}
