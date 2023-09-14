package StringManuplation1;


public class ReplaceTimeSpam {
    public static void main(String[] args) {


        String time="26/10/2022 09:90";
        System.out.println(timeSpam(time));



    }

    private static String timeSpam(String time) {
        time = time.replace("/", "").replace(":", "").replace(" ", "");

        return time;




    }
}
