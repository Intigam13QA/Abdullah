package ClassAndObjekts;

public class Employee {
    String name;
    String jobTitle;
    String salary;

    public void work() {
        System.out.println(name + " is working hard");

    }

    public void attendmeeting() {
        System.out.println(name + " is attending meeting");

    }

    public void introduce() {
        System.out.println("Name: " + name + ", job title: " + jobTitle + ", salary: " + salary +"$");

    }
}
