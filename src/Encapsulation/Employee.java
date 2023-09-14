package Encapsulation;

public class Employee {
    private String name;
    private int ID;
    private String department;
    private String position;

    public Employee(){
        name = "";
        ID = 0;
        department = "";
        position = "";
    }
    public Employee(String name, int ID){
        this.name = name;
        this.ID = ID;
        department = "";
        position = "";
    }

    public Employee(String name,int ID, String department, String position) {
        this.name = name;
        this.ID = ID;
        this.department = department;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
