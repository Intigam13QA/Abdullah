package InheritanceTwo;

public class Contractor extends Employee{
    @Override
    public Contractor calculatePaid(int hours, double rate) {
        double total = (hours*rate)+200;
        System.out.println("Contractor payment is: "+total);
        return new Contractor();
    }
}
