package CollectionPart1;

import java.util.HashSet;
import java.util.Set;

public class LoopSet {

    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(50);
        nums.add(60);
        nums.add(70);
        nums.add(80);
        nums.add(90);
        nums.add(100);
        nums.add(110);
        nums.forEach(n-> System.out.print(n+" "));
        System.out.println();
        for (Integer n : nums){
            System.out.print(n+" ");
        }
       /* for (int i = 0; i<nums.size();i++){
            System.out.println(nums.get(i));
        }*/
        System.out.println();
        nums.removeIf(m-> m<110);
        System.out.println(nums.toString());
    }
}
