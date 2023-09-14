package Inheritance;

public class Student extends Person{
    int studentId;
    String termClass;
    public void code(String language){
        System.out.println(name+" is coding"+ language);
    }
    public void attendClas(){
        System.out.println(name+ " is attending "+ termClass+ " class");
    }
}
