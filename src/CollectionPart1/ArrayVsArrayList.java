package CollectionPart1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        String [] days =new String[7];
        days [0] = "Monday";
        int [] nums = {24,5,67,90};
        Object[] obj = {23,'A',"Ali",34.6};

        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = list1;
        Collection<Integer> list3 = new ArrayList<>();
        ArrayList<Object> obj1 = new ArrayList<>();
        obj1.add(1);
        obj1.add("Ali");
        obj1.add('V');
        System.out.println(obj1.toString());

    }
}
