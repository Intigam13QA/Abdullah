package ArrayLIST;

import java.util.ArrayList;

public class RemoveAll {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1); num.add(2); num.add(3);num.add(5);
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(4);num2.add(5); num2.add(6);
        System.out.println(num);
        System.out.println(num2);
        num2.removeAll(num);
        System.out.println(num2);

    }
}
