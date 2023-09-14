package ArrayLIST;

import java.util.ArrayList;

public class ArayLisyPractice1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        names.add("Ali");
        names.add("Qasim");
        names.add("Hasan");
        nums.add(23);
        nums.add(new Integer("24"));
        System.out.println(names.get(0));
        System.out.println("Names size " + names.size());
        System.out.println(nums.get(1));
        System.out.println("NUMs size " + nums.size());
        System.out.println(names.toString());
        System.out.println(nums.toString());


    }
}
