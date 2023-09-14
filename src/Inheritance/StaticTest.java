package Inheritance;

public class StaticTest {
    public static void main(String[] args) {
        StaticSup obj1 = new StaticSup();
        obj1.num = 5;
        obj1.print();

        StaticSup.num = 10;
        System.out.println(StaticSup.num);
        //StaticSup.m2(); not static
        obj1.m2();
    }
}
