package Encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ali",1981112);
        Employee e3 = new Employee("Abdullah",1971313,"IT","Tester");
        System.out.println(e1.getName()+ " | "+e1.getID()+ " | "+ e1.getDepartment()+ " | "+e1.getPosition());
        System.out.println(e2.getName()+ " | "+e2.getID()+ " | "+ e2.getDepartment()+ " | "+e2.getPosition());
        System.out.println(e3.getName()+ " | "+e3.getID()+ " | "+ e3.getDepartment()+ " | "+e3.getPosition());
        e1.setName("Mike");
        e1.setID(13231323);
        e1.setDepartment("QA");
        e1.setPosition("SoftWare");

        System.out.println(e3.toString());
        System.out.println(e1.getName()+ " | "+e1.getID()+ " | "+ e1.getDepartment()+ " | "+e1.getPosition());
    }
}
