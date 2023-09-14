package ArrayLOPS;

public class LOp19 {
    public static void main(String[] args) {
        int[] x = {1, 2, 2, 6,8,55, 7, 4, 3};
        boolean findSix = false;
        int counter = 0;
        for (int i = 0; i < x.length; i++) {
            if (findSix) {
                if (x[i]==7){
                    findSix =false;
                }

            } else if (x[i] == 6) {
                findSix=true;

            }else {
                counter=counter+x[i];
            }
        }
        System.out.println(counter);
    }
}
