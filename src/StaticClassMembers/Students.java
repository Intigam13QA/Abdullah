package StaticClassMembers;

public class Students {
    String name;
    int age;
    int Id;
   static String school;



    public Students(String name, int age, int Id, String school){
        this.name = name;
        this.age = age;
        this.Id = Id;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Id=" + Id +
                ", school='" + school + '\'' +
                '}';
    }
}
