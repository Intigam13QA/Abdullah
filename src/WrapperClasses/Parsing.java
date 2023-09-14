package WrapperClasses;

public class Parsing {
    public static void main(String[] args) {
        String st = "2018";
        st+=1;
        System.out.println(st);
        int num = Integer.parseInt(st);
        System.out.println(num);
        num+=9;
        System.out.println(num);
        System.out.println(st);
        double d = Double.parseDouble(st);
        System.out.println(d);

        // test 96
        String str = "Today weather is sunny. and degree is 72 degree. It is porfect to practice Java ";
        System.out.println(str.indexOf("7"));
        double nums = Double.parseDouble(str.substring(38,40));
        double numss=(nums-32)*5/9;

        System.out.println(nums+" degree is equal to "+ numss+" celcium");
    }
}
