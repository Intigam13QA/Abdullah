package ArrayLOPS;

public class Lop18 {
    public static void main(String[] args) {
        int [] x = {1,2,2,1,13,3,1};
        System.out.println(Counter13(x));
    }

    private static int Counter13(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            counter=counter+arr[i];
            if (arr[i]==13){
                counter=counter-arr[i]-arr[i+1];
            } /*else { for numbers not include
                break;
            }*/
        }
        return counter;
    }
}
