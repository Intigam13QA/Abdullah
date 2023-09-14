package Constracror;

public class StusentClass {

    static String name;
    int age;
    char gender;
    int year;
    String cours;
    String university = "Cybertek";

    public StusentClass(String name, int age, char gender, int year, String cours) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.year = year;
        this.cours = cours;


    }
    public void attendLecture(){
        System.out.println(name+ " is " +age +" old "+ gender+" year "+ year+" study "+ cours+" at "+university);
    }
    public void  submitAssignment(){
        System.out.println(name+" submited assignment and");
    }
    public void attendLap(){
        System.out.println(name+ " attended lab");
    }
}
