package Constracror;

public class DiceTest {
    public static void main(String[] args) {

        int six = 6;

        Dice Value_Six = new Dice(six);
        runRoll(Value_Six);

    }
    public static void runRoll(Dice d){
        System.out.println("Value is : "+ d.getValue());
        System.out.println("Sides is : "+ d.getSides());
    }
}
