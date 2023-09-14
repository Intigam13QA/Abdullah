package ArrayPart1;

import java.util.Arrays;

public class SplitTask2 {
    public static void main(String[] args) {
        String info1 = "An essay is, generally, a piece of writing that gives the author's own argument,";
        String info2 = "An essay is, generally, a piece of writing that gives the author's own argument,";
        String Info1 [] = info1.split("of");
        String Info2 [] = info2.split("of");
        String key1 = Info1[1].split("that")[0];
        String key2 = Info2 [1].split("that")[0];
        System.out.println(key1.substring(1,5)+key2.substring(5,8));
        System.out.println(Arrays.toString(Info1));



    }
}
