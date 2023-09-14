package StaticClassMembers;

public class CalculatorTest {
    public static void main(String[] args) {
        double plusResult = Calculator.plus(34,67);
        System.out.println(plusResult);

        double multplResult = Calculator.multiple(34,5);
        System.out.println(multplResult);


        CalculatorTest.mA();
        CalculatorTest C1 = new CalculatorTest();
        C1.mA();


    }
    public static void mA(){
        System.out.println("hello");
    }

}
