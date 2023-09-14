package Constracror;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator n1 = new Calculator();
        System.out.println(n1.add());
        System.out.println(n1.reduces());
        Calculator n2 = new Calculator(25,5);
        System.out.println(n2.add());
        System.out.println(n2.reduces());

        Calculator n3 = new Calculator(30,35,"Boy");
        System.out.println(n3.add());
        System.out.println(n3.reduces());
    }
}
