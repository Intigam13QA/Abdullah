package AccessModifier;

public class MethodHidingTest {

}
class Bear{
    public static void eat(){
        System.out.println("Bear is eating");
    }
    public static void sneeze(){
        System.out.println("Bear is sneezing");
    }
    public void hibernate(){   //overriding
        System.out.println("Bear is hibernating");
    }
}
class Panda extends Bear{
    public static void eat(){
        System.out.println("Panda is eating");
    }
   /* public void sneeze(){
        System.out.println("Panda is sneezing");
    }*/
    public void hibernate(){  //overriding
        System.out.println("Panda is hibernating");
    }
}
