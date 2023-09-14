package LapStringManuplation1;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(evenString("Abdullahaa"));
        System.out.println(withoudend("ADA"));
        System.out.println(withoudend("ADASH"));
        System.out.println(withoudend("SH"));
        System.out.println("purr");


        System.out.println(comboString("qasim", "ADA"));
        System.out.println(comboString("Q", "A"));

        System.out.println(left2("Hello"));
        System.out.println(left2("JAVA"));
        System.out.println(left2("JA"));
        System.out.println(left2("JAVAScript"));


        System.out.println(frontAgain("tarita"));
        System.out.println(frontAgain("ta"));
        String q = "purr";

        System.out.println(q.length());
        String space = " ";
        String c = space + "Hello" + space + space;
        c.concat("World");
        System.out.println(c);
        String t = c.trim();
        System.out.println(t.length());
        System.out.println(c);
        System.out.println(t);


        String f = "MINUMUM";
        System.out.println(f.substring(4, 7));


    }

    private static boolean frontAgain(String tarita) {
        String a = tarita.substring(0, 2);
        String b = tarita.substring(tarita.length() - 2);

        return a.equals(b);


    }

    private static String left2(String sa) {
        if (sa.length() < 2) {
            System.out.println("Invalid string");
        }

        String a = sa.substring(2) + sa.substring(0, 2);

        return a;
    }

    private static String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;

        } else {
            return a + b + a;
        }

    }

    private static String withoudend(String qa) {
        if (qa.length() < 2) {
            System.out.println("Invalid");
        }

        return qa.substring(1, qa.length() - 1);
    }


    public static String evenString(String st) {

        return st.substring(0, st.length() / 2);


    }


}

