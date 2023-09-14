package WrapperClasses;

public class WrapperClas {
    public static void main(String[] args) {
        int n1 = 12;
        Integer n2 = new Integer(10);
        System.out.println(n1);
        System.out.println(n2);;


        double d3 = 23.4;
        Double d1 = new Double(23.4);
        Double d2 = new Double("23.4");
        System.out.println(d3);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println((d1+d2+d3)/3);

        char c ='a';
        Character c1 = new Character('a');
        System.out.println(c);
        System.out.println(c1);

        byte b = 100;
        Byte b1 = new Byte((byte) 100);
        Byte b2 = new Byte("100");
        System.out.println(b);
        System.out.println(b1);

    }

}
