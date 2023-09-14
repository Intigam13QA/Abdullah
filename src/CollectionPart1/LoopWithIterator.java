package CollectionPart1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopWithIterator {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(60);
        nums.add(70);
        nums.add(80);
        nums.add(90);
        nums.add(100);
        nums.add(110);

        Iterator<Integer> it = nums.iterator();
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        Iterator<Integer> it2 = nums.iterator();
        System.out.println(it2.next());

        System.out.println();

        List<String > city = new ArrayList<>();
        city.add("NeWYork");
        city.add("Baku");
        city.add("Istanbul");
        for (String c : city){
            if (c.equals("Baku")){
                city.remove(c);

            }
            System.out.println(city);
        }

    }
}
