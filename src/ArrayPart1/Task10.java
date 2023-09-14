package ArrayPart1;

public class Task10 {
    public static void main(String[] args) {
        int [] array1 = {2,4,6,8,10};
        int [] array2 = array1;
        array1[0]=200;
        array2[4]=1000;
        System.out.println("Array1");
        for (int value : array1){
            System.out.println(value);
        }
        System.out.println("Array2");

        for (int value : array2){
            System.out.println(value);
        }
    }
}
