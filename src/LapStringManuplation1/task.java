package LapStringManuplation1;


public class task {
    public static void main(String[] args) {
        System.out.println(hello("Abdullah"));

        System.out.println(Return("Hi", "Bye"));
        System.out.println(towlop("Abdullah"));
        System.out.println(towlop("Hi"));
        System.out.println(towlop("A"));
        System.out.println(Return1("Abdullah"));
        System.out.println(Return1(""));
        System.out.println("Xb");

    }

    private static String Return1(String st) {
        if (st.length() < 2) {
            return st;
//        } else if (st.isEmpty()) {
//
//            return "";

        } else {
            return st.substring(0, 2);

        }
    }


    private static String towlop(String s) {
        if (s.length() < 2) {
            return "Invalid String";
        }
        String repit = "";
        repit = s.substring(s.length() - 2);
        return repit + repit + repit;
    }

    public static String hello(String str) {
        return "Hello ".concat(str);

    }

    public static String Return(String st, String string) {
        return st + string + string + st;
    }
}
