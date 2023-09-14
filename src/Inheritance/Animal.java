package Inheritance;

public class Animal {
    private String  name;
    private  int brain;
    private  int body;
    private  int size;
    private int weight;

    public Animal(String name, int body, int brain, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size =size;
        this.weight = weight;

    }
    public void ead(){
        System.out.println("Animal.ead() is called");
    }

    public void move(int speed){
        System.out.println("Animal.ead() is moving at:"+speed);
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
