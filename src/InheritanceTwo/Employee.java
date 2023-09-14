package InheritanceTwo;

public class Employee {
    public Employee  calculatePaid(int hours, double rate){
        System.out.println("The payment is: "+(hours*rate));
        return new Employee();
    }
}
