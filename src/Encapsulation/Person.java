package Encapsulation;

public class Person {
    private String name;
    private int age;
    private String gender;
    public Person(String name, int age, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if (age>0 || age<100){
           this.age = age;
       }else {
           this.age = 0;
       }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
