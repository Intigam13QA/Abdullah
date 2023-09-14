package CollectionPart1;

import java.util.ArrayList;
import java.util.List;

public class LoopArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(60);
        nums.add(70);
        nums.add(80);
        nums.add(90);
        nums.add(100);
        nums.add(110);
        for (int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i< nums.size(); i++){
            System.out.print(nums.get(i)+ " ");
        }
        System.out.println();
        //looping using with forEach method Lambo expression
        nums.forEach(m-> System.out.print(m+" "));
        System.out.println();
        System.out.println(nums.removeIf(d-> d<=80));
        nums.forEach(b-> System.out.print(b+" "));

    }
}
