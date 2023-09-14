package Constracror;

public class StudentTest {
    public static void main(String[] args) {
       StusentClass s1 = new StusentClass("Mike", 17, 'M', 2016, "Java");
       s1.attendLecture();
       s1.submitAssignment();
       s1.attendLap();
        System.out.println();
        StusentClass s2 = new StusentClass("Nike", 30, 'F', 2020, "JavaScript");
        s2.attendLecture();
        s2.submitAssignment();
        s2.attendLap();

    }
}
