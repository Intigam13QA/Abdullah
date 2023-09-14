package CollectionPart1;

import java.util.*;


public class SetExample {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(100);
        mySet.add(200);
        mySet.add(300);
        mySet.add(400);
        mySet.add(500);
        mySet.add(600);
        mySet.add(600);
        System.out.println(mySet.toString());
        System.out.println(mySet.size());

        List<String > list = Arrays.asList("23","23","aa","bb");
        Set<String > unique = new HashSet<>(list);
        System.out.println(list.toString());
        System.out.println();
        System.out.println(unique.toString());

        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(12);
        tset.add(-34);
        tset.add(500);
        tset.add(125);
        tset.add(45);
        tset.add(12);
        System.out.println(tset.toString());
        System.out.println(tset.size());


    }

}
