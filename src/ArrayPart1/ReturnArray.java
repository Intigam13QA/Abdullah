package ArrayPart1;

public class ReturnArray {
    public static void main(String[] args) {
        double[] value;
        value = getArray();
        for (double num : value) {
            System.out.println(num);

        }

    }

    public static double[] getArray() {
        double[] array = {3.5, 4.4, 5.6, 6.7, 7.8, 8.3};
        return array;
    }

}
