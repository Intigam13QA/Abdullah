package CollectionPart1;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<String > v = new Vector<>();
        v.add("water");
        v.add("tea");
        v.add("greenTea");
        for (String str : v){
            System.out.println(str);
        }
        System.out.println(v.size());
        System.out.println(v.get(2));
        System.out.println(v.remove(0));
        System.out.println(v);
    }
}
