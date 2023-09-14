package Constracror;

public class Car {
    String name;
    int mile;
    int year;
    String color;

    public Car(String name, int mile){
        this.name = name;
        this.mile = mile;

    }
    public Car(String name,int mile,int year,String color){
        this.name=name;
        this.mile=mile;
        this.year = year;
        this.color = color;
    }
    public Car() {
      name ="VOL";
      mile = 6789;
      year = 2000;
      color = "Red";
        System.out.println(name + mile);
    }

}
