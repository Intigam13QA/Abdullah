package AccessModifier;

public class Mouse extends Rodent{
    protected int taillenght =8;
    public void getMousDetails(){
        System.out.println("Mouse tail is "+ taillenght+" , Parent tail is "+taillenght);
    }
}
