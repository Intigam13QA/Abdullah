package ClassObj2;

public class BmwObj {
    public static void main(String[] args) {
        BMW b1 = new BMW();
        BMW b2 = new BMW ();
        b1.model = "330i";
        b1.model = "m3";
        b2.model = "X3";
        b2.showprice();
        b1.showprice();

    }
}
