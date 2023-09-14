package ArrayPart1;

public class PassingArrayMethod {
    public static void main(String[] args) {


        int[] numbers = {2, 3, 4, 5, 6, 7, 8};
        for (int valu : numbers){
            showvalue(valu);
        }

    }

    private static void showvalue(int n) {
        System.out.print(n+" ");
    }
}
