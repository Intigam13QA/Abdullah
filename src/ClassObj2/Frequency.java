package ClassObj2;

public class Frequency {
    public static void main(String[] args) {
        uniqueFrequency("aabcccd");
    }

    private static String uniqueFrequency(String s) {
        String result = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            result+= s.charAt(i);


        }
        return result +":" +count;
    }
}






