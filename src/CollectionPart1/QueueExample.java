package CollectionPart1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String > queue = new LinkedList<>();
        queue.add("Mike");
        queue.add("Tom");
        queue.add("Jerry");
        queue.add("BIG Boss");
        System.out.println(queue);

        String name = queue.remove();
        System.out.println(queue.toString());
        System.out.println(name);
        name = queue.poll();
        System.out.println(queue.toString());
        System.out.println(name);
        name = queue.peek();
        System.out.println(queue.toString());
        System.out.println(name);
    }
}
