package MAIN1;

public class day11 {
    public static void main(String[] args) {
        deer(100, false);
        speed(60, false);

    }

    public static void speed(int s, boolean m) {
        if (m == false) {
            if (s <= 60) {
                System.out.println("result is:0");
            } else if (s >= 61 && s <= 80) {
                System.out.println("result is:1");
            } else {
                System.out.println("result is: 2 for normal case");
            }

        }
        if (m == true) {
            if (s <= 65) {
                System.out.println("result is:0");
            } else if (s >= 66 && s <= 85) {
                System.out.println("result is:1");
            } else {
                System.out.println("result is: 2 for HB case");
            }


        }
    }

    public static void deer(int n, boolean m) {
        if (m == true) {
            if (n >= 60 && n <= 100) {
                System.out.println("true for summer");
            } else {
                System.out.println("false for summer");
            }

        }
        if (m == false) {
            if (n >= 60 && n <= 90) {
                System.out.println("true for  winter");
            } else {
                System.out.println("false for winter");
            }
        }

    }
}
