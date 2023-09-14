package ClassObj2;

import java.lang.invoke.SwitchPoint;

public class BMW {
    String make;
    String model;
    double price;

    public void showprice() {

        switch (model) {
            case "330i":
                price = 40250;
                break;
            case "740i":
                price = 85000;
                break;
            case "m3":
                price = 65000;
                break;
            default:
                System.out.println(model + " is not availabile");
                price = 0.0;

        }
        System.out.println("Price: " + price);
    }
}

