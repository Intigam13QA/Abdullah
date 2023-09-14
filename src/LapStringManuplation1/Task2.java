package LapStringManuplation1;

public class Task2 {
    public static void main(String[] args) {


        String str = "abc hi hello optimize hr bye hi";
        int counter = 0;
        for (int i = 0; i < str.length() - 7; i++) {

            if (str.substring(i, i + 8).equals("optimize")) {
                counter++;
            }

        }
        System.out.println(counter);
        System.out.println(str.length());

        /*(***********************************************)*/


        String s = "cata dogdog";
        int c = 0;
        int d = 0;

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("cat")) {
                c++;
            } else if (s.substring(i, i + 3).equals("dog")) {
                d++;
            }
        }
        if (c != 0 && d != 0) {
            if (c == d) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        System.out.println("**********************************");




    }
}







