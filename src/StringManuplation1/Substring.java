package StringManuplation1;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

public class Substring {
    public static void main(String[] args) {
        String sc = "FavaString";
        System.out.println(sc.substring(2));
        System.out.println(sc.substring(sc.length()-4));
        System.out.println(sc.substring(4,4));
        System.out.println("44444");


        String chars = "{{}}";
        String str = "Automation";
        String result = chars.substring(0,2)+str+chars.substring(2);
        System.out.println(result.toUpperCase(Locale.ROOT));

        String d = "";
        System.out.println(d.isEmpty());
    }
}
