package ArrayLIST;

import java.util.ArrayList;

public class ArrayListPr2 {
    public static void main(String[] args) {
        ArrayList<String> language = new ArrayList<>();
        language.add("Russian");
        language.add("Azerbaijan");
        language.add("Java");
        System.out.println("Language size is " + language.size());
        System.out.println(language.toString());
        language.add("Turkish");
        System.out.println("Language size is " + language.size());
        System.out.println(language.toString());
        language.remove(0);
        System.out.println(language.toString());
        System.out.println("Language size is " + language.size());

        System.out.println("*************************");

        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        System.out.println(nums.size()==0);
        nums.add(4);
        nums.add(1);
        nums.add(5);
        nums.add(10);
        nums.add(55);
        nums.add(44);
        nums.add(100);
        System.out.println(nums.toString());
        nums.remove(5);
        System.out.println(nums.toString());
        Integer nm = new Integer(5);
        Integer mn = Integer.valueOf(5);
        Integer n =5;
        nums.remove(mn);
        System.out.println(nums.toString());
        nums.remove(new Integer(4));
        System.out.println(nums.toString());

    }
}
