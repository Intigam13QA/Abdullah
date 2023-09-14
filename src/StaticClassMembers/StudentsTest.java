package StaticClassMembers;

public class StudentsTest {
    public static void main(String[] args) {
        Students s1 = new Students("Abdullah", 25,1971313, "Life");
        Students s2 = new Students("Ali",34, 123321, "LIFE");
        Students s3 = new Students("Artur", 32,4321,"Life");
        s1.school= "LifeEu";
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

    }
}
