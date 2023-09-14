package WrapperClasses;

public class Vararg {
    public static void main(String[] args) {
        sum(2,34,5);
        sum(4,5);
        names("Apple","Alp","Abdullah","123");
    }

    private static void names(String ... str) {
        String add= "";
        for ( String value : str){
            add=add+value+" ";
        }
        System.out.print(add);
    }

    private static void sum(int ... numbers) {
        int sums =0;
        for (int value:numbers){
            sums=sums+value;

        }
        System.out.println(sums);
        System.out.println(Math.round(4.6));
        System.out.println(Math.floor(4.5));
    }
}
