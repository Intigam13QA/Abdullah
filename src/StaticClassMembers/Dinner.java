package StaticClassMembers;

public class Dinner {
    static int pizzaslize = 8;
    public void takeASlize () {
        pizzaslize--;
    }
    public void takeASlize ( int count){
        pizzaslize-=count;
    }
}
