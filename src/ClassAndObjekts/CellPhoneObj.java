package ClassAndObjekts;

public class CellPhoneObj {
    public static void main(String[] args) {

        CellPhone cell = new CellPhone();
        cell.brand = "Nokia";
        cell.color = "Red";
        cell.price = 34;
        cell.screenSize = 3.5;

        cell.call();
        cell.takeAphoto();
        cell.message();
    }
}
