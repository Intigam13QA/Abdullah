package StringManuplation1;

public class StringIndexOf {
    public static void main(String[] args) {
        checkingString("Your confirmation number is XLY", "confirmation");

    }

    public static void checkingString(String str1, String str2) {

        if (str1.contains(str2)) {
            System.out.println("Confirm index is " + str1.indexOf(str2));
        } else {
            System.out.println("Not founded");
        }
//        String word1 = "Get up";
//        System.out.println(word1.indexOf("up"));
//        System.out.println(word1.indexOf("p"));
//        System.out.println(word1.indexOf("java"));
//        System.out.println(word1.indexOf("get"));
//        System.out.println(word1.indexOf("Get"));
//        System.out.println();
//
//        String url = "www.azerbaijanidelight.com";
//        int i = url.indexOf(".");
//        System.out.println(i);
//        System.out.println(url.charAt(i + 1));
//
        String url1 = "My-name-is-Abdullah";
        int firstdash = url1.indexOf("-");
        System.out.println("First dash is:" + firstdash);
        int secondDash = url1.indexOf("-", firstdash + 1);
        System.out.println("Second dash is: " + secondDash);
        int thirddash = url1.indexOf("-", secondDash + 1);
        System.out.println("Third dash is: " + thirddash);
        int last = url1.lastIndexOf("-");
        System.out.println("Last dash is: " + last);


//        String title = "Java - Google Search";
//        int a = title.indexOf("-");
//        System.out.println(title.charAt(a - 1));
//        System.out.println(title.charAt(a + 1));
//        System.out.println(title.indexOf(" "));
//
//
//        String country = "United States of Amerika";
//        int state = country.indexOf("States");
//        System.out.println("Position of State is; " + state);
//
//        String word = "Java, C++, Pyton, Java Script";
//        if (word.contains("C++")) {
//            System.out.println("Position of C++ is: " + word.indexOf("C++"));
//
//            if (word.indexOf("C++") > -1) {
//                System.out.println("C++ is there");
//
//            } else {
//                System.out.println("C++ is not there");
//            }
//
//
//        }
    }
}
