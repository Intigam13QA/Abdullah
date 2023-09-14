package CollectionPart1;

import java.util.Stack;
import java.util.Vector;

public class StackExample {
    public static void main(String[] args) {
        Vector<Integer> numStack = new Stack<>();
        numStack.add(50);
        numStack.add(70);
        numStack.add(500);
        numStack.add(50);
        System.out.println(numStack.toString());
        // check value on top of stack
        System.out.println(((Stack<Integer>) numStack).peek());
        System.out.println(numStack);
        // read value on top of stack then remove it
        System.out.println(((Stack<Integer>) numStack).pop());
        System.out.println(numStack);
        ((Stack<Integer>) numStack).pop();
       // System.out.println(numStack.peek()); before Casting
        System.out.println(numStack.get(0));
        numStack.add(23);
        System.out.println(numStack);
    }
}
