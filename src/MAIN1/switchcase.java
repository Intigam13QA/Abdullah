package MAIN1;

public class switchcase {
    public static void main(String[] args) {
        String weather = "bad";
        switch (weather) {
            case "sunny":
                System.out.println("Go to park");
                System.out.println("Code Java");
                break;
            case "hot":
                System.out.println("Go to swimming");
                System.out.println("Code Java");
                break;
            case "windy":
                System.out.println("Fly a kite");
                System.out.println("Code Java");
                break;
            case "snow":
                System.out.println("Go to snowboarding");
                System.out.println("Code Java");
                break;
            default:
                System.out.println("Code Java in any other weather");


        }
        int math = 39;
        int chem = 67;
        int bio = 45;
        String operator = "-";
        int result = 0;
        switch (operator) {
            case "+":
                result = (math + chem + bio);
                break;
            case "-":
                result = math - chem - bio;
            default:
                System.out.println("error 404");


        }
        System.out.println(result);


        String model = "dell";
        switch (model) {
            case "apple":
                System.out.println("Apple-no virus");
                break;
            case "dell":
                System.out.println("Tough one");
                break;
            case "acer":
                System.out.println("Not recommended");
            default:
                System.out.println("do not buy that one!");
        }

        String days = "6";
        switch (days) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");

        }
        char grade = 'A';
        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("pass");
                break;
            case 'D':
            case 'E':
                System.out.println("fail");
                break;
        }


        char color = 'o';
        switch (color) {
            case 'R':
            case 'r':
                System.out.println("Red");
                break;
            case 'O':
            case 'o':
                System.out.println("Orange");
                break;
            case 'G':
            case 'g':
                System.out.println("Green");
                break;


        }
    }
}
