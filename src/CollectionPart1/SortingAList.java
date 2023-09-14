package CollectionPart1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAList {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("Java");
        list.add("JS");
        list.add("html");
        list.add("ruby");
        list.add("kotlin");
        list.add("c++");
        System.out.println("Before Sorting");
        System.out.println(list.toString());
        System.out.println("After Sorting");
        Collections.sort(list);
        System.out.println(list.toString());

        List<Product> proList = new ArrayList<>();
        proList.add(new Product("Apple",67.5));
        proList.add(new Product("Iphone",99.5));
        proList.add(new Product("Netbook",78.5));
        proList.add(new Product("Samsung",45.5));
        System.out.println(proList.toString());
        Collections.sort(proList);
        System.out.println("After Doing Comparable ");
        System.out.println(proList);

    }
}
