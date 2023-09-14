package CollectionPart1;

import java.util.LinkedList;
import java.util.List;

public class LinkListExample {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(1);
        list.add(34);
        list.add(100);
        System.out.println(((LinkedList)list).getFirst());
       ((LinkedList<Integer>) list).addFirst(99);
        System.out.println(list);
    }
}
