package ArrayLIST;

import java.util.ArrayList;
import java.util.List;

public class ContainsMethod {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("jan");
        list1.add("feb");
        list1.add("mach");
        list1.add("aprel");
        list1.add("may");
        System.out.println(list1);
        ArrayList<String> list2 =list1;
        System.out.println(list2);
        ArrayList<String> month = new ArrayList<>(list1);
        System.out.println("Month " +month);
        month.add("Jun");
        month.add("July");
        month.add("Auguste");
        System.out.println(month.contains("Auguste"));




    }

}
