package InheritanceTwo;

public class Student extends Person{
    @Override
    public void message() {
      super.message();
        System.out.println("This is student class");
    }
    public void display(){
        message();
        super.message();
    }
}
