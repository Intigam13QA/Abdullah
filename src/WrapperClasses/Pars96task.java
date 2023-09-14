package WrapperClasses;

import java.util.Arrays;

public class Pars96task {
    public static void main(String[] args) {

        String str = "Today weather is sunny and 0 degree. It is porfect to practice Java ";


        String [] arr = str.split("and ");
        arr= arr[1].split(" degree");
        String degre = arr[0];
        double degreF = Double.parseDouble(degre);
        double degreC = (degreF-32) *5/9;
        System.out.println(degreF+" degree is equal to "+ Math.round(degreC)+" celcium");
        int [] x = {1,2,3,4,5,6,7,8};
        String s = "java101";
        System.out.println(Character.isAlphabetic(s.charAt(3)));
        System.out.println(Character.MAX_VALUE);
        Integer n = Integer.valueOf("34");

        System.out.println(n);
        int nm = n+1;
        System.out.println(nm);


    }
}
