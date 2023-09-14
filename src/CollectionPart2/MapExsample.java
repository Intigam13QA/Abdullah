package CollectionPart2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExsample {
    public static void main(String[] args) {

        List<Integer> items2 = new ArrayList<>();
        items2.add(10);
        Map<String, Double> items = new HashMap<>();
        items.put("Apple",23.4);
        items.put("Flower",4.5);
        items.put("Milk",1.5);
        items.put("Eggs",0.5);
        items.put("Book", 4.5);
        items.put("Apple",25.4);
        System.out.println(items.size());
        System.out.println(items.toString());
        System.out.println(items.isEmpty());
        System.out.println(items.get("Pen"));
        System.out.println(items.get("Apple"));
        System.out.println(items);
        items.remove("Book");
        System.out.println(items);
        System.out.println("Is Book there? "+items.containsKey("Book"));
        items.put("Milk",3.4);


    }
}
