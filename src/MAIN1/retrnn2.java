package MAIN1;

public class retrnn2 {
    public static void main(String[] args) {
        ret("Mike", 1957);
        higescpl("TOM", 500);
    }

    public static void higescpl(String name, int score) {
        System.out.println(name + " managed to get into " + calculate(score) + " position" + " on the hige " + score + " table");
    }

    public static int calculate(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score <= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }

    }

    public static void ret(String name, int year) {
        int ret = 65 - age(year);
        System.out.println(name + "left " + ret);
    }

    public static int age(int yearbth) {
        return 2022 - yearbth;
    }
}
