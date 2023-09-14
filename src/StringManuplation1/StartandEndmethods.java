package StringManuplation1;

public class StartandEndmethods {
    public static void main(String[] args) {
        String name = "Dr.abdullah";
        if (name.startsWith("Dr")){
            System.out.println("He is a man");
        }else if (name.startsWith("Ms")){
            System.out.println("She is a woman");
        }else {
            System.out.println("No status");
        }
    }
}
