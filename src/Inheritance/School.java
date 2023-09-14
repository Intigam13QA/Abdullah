package Inheritance;

public class School {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        person.name = "Abdulla";
        person.age = 25;
        person.gender = 'M';

        student.name = "Ali";
        student.age = 34;
        student.gender = 'M';
        student.studentId = 1971313;

        person.eat("Piti");
        student.eat("Doner");


    }
}
