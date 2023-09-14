package InheritanceTwo;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee  calculatePaid(int hours, double rate){
        double total = (hours*rate)*1.05;
        System.out.println("Fultime payment is: "+total);
        return new FullTimeEmployee();
    }
}
