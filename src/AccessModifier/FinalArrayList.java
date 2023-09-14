package AccessModifier;

import java.util.ArrayList;

public class FinalArrayList {
    public static void main(String[] args) {
    final ArrayList <String> colors = new ArrayList();
        colors.add("Yellow");
        colors.add("White");
        colors.add("Red");
        colors.set(1,"Green");
        System.out.println(colors.get(1));
        //colors =new ArrayList<>();


        int A = 5;
        int B = 6;
        final int [] xxx = {A,B};
        xxx[0]=0;
        System.out.println(xxx[0]);


    }
}
