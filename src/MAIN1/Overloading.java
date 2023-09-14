package MAIN1;

public class Overloading {
    public static void main(String[] args) {
        calFeetabdInches(100);


    }

    public static double calFeetabdInches(double feet, double inches) {
        if (feet < 0 || inches <0 || inches>12){
            return -1;
        }
        double centimetrs = (feet*12)*2.54;
        System.out.println(feet + " feet " + inches + " inches= " + centimetrs + " centimetrs");
        return centimetrs;
    }
    public static double calFeetabdInches(double inches){
        if (inches<0){
            return -1;
        }
        double feet = (int)inches/12;
        double remaininches = inches%12;
        System.out.println(inches + " inches= " + feet + " feet " + remaininches + " inches ");
        return calFeetabdInches(feet, remaininches);

    }
}
