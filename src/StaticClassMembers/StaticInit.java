package StaticClassMembers;

public class StaticInit {
    static final int num_second_per_hours;

    static {
        System.out.println("StaticInit");
        int numSecondPerMinutes = 60;
        int numMinutePerHours = 60;
        num_second_per_hours = numSecondPerMinutes*numMinutePerHours;
    }
    private static int one;
    private static final int two;
    private static final int three = 3;
    private static final int four;
    static {
        one =1;
        two =2;
        /*three=2;
        two=4;*/
        four=5;
    }
}
