package Inheritance;

public class Dog extends Animal{
    private int eye;
    private int legs;
    private  int tails;
    private  int teeth;
    private  String  coat;

    public Dog(String name, int body, int brain, int size, int weight,int eye, int legs,int tails,int teeth
            ,String coat) {
        super(name, body, brain, size, weight);
        this.coat = coat;
        this.eye = eye;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
    }
    public  void chew(){
        System.out.println("Dog.chew() is called");
    }

    @Override
    public void ead() {
        System.out.println("Dog.eat() is called");
        chew();
        super.ead();
    }
    public void wolk(){
        System.out.println("Dog.wolk() called");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        doglegs(speed);
        super.move(speed);
    }
    public void doglegs(int speed){
        System.out.println("Dog.legs() called");
    }
}
