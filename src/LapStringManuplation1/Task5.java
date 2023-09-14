package LapStringManuplation1;

public class Task5 {
    public static void main(String[] args) {
        String str = "H";
        if (str.length()<2){
            System.out.println(str.substring(0)+"@");
        }else {
            System.out.println(str.substring(0,2));
        }
    }
}
