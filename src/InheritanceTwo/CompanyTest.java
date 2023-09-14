package InheritanceTwo;

public class CompanyTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        FullTimeEmployee ft = new FullTimeEmployee();
        Contractor ct = new Contractor();
        ft.calculatePaid(40,40);
        ct.calculatePaid(40,40);
        emp.calculatePaid(40,40);

    }
}
