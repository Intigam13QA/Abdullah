package StaticClassMembers;

public class DinnerTest {
    public static void main(String[] args) {
        int o = 0;
        Dinner mom = new Dinner();
        Dinner kid = new Dinner();
        Dinner dad = new Dinner();
        // without static
        /*System.out.println("Total Pizza Slize : "+ o);
        mom.takeASlize ();
        o = mom.pizzaslize;
        System.out.println("Total Pizza Slize : "+ o);
        kid.takeASlize(3);
        o = kid.pizzaslize;
        System.out.println("Total Pizza Slize : "+ o);
        dad.takeASlize(8);
        o = dad.pizzaslize;
        System.out.println("Total Pizza Slize : "+ o);*/

       /* with static*/

        System.out.println("Total Pizza Slice "+ Dinner.pizzaslize);
        mom.takeASlize(3);
        dad.takeASlize(2);
        kid.takeASlize(3);
        System.out.println("Total Pizza Slice "+ Dinner.pizzaslize);


    }
}
