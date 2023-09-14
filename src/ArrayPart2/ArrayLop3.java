package ArrayPart2;

public class ArrayLop3 {
    public static void main(String[] args) {
        int [] x = {1,2,3};
        int [] y ={7,3};

        int [] x1 = {1,2,3};
        int [] y1 = {7,3,2};

        int [] x2 = {1,2,3};
        int []y2 = {1,2};

        int []x3 = {1};
        int[] y3 ={7,3};

        int [] x4 = {1,2,3};
        int [] y4 = {1};
        System.out.println(Twoarray(x,y));
        System.out.println(Twoarray(x1,y1));
        System.out.println(Twoarray(x2,y2));
        System.out.println(Twoarray(x3,y3));
        System.out.println(Twoarray(x4,y4));


    }

    public static String Twoarray(int[] ar, int[] arr) {
      if (!(ar.length>1)){
          return "Array1 not valid array";
      }
      if (!(arr.length>1)){
          return "Array2 not valid array";
      }
      if(ar[0]==arr[0] || ar[ar.length-1]==arr[arr.length-1]){
          return "True";
      }
      return "False";
    }
}
