package ClassAndObjekts;

public class EmploeeObj {
    public static void main(String[] args) {
        Employee job = new Employee();

        job.name = "Abdullah";
        job.jobTitle = "Junior Tester";
        job.salary = "5000";

        job.work();
        job.attendmeeting();
        job.introduce();
    }
}
