package StaticClassMembers;

public class AllBlocks {
    public AllBlocks(int x){
        System.out.println("One Argument Constructor");
    }
    public AllBlocks(){
        System.out.println("No Argument Constructor");
    }
    static {
        System.out.println("First Static Init");
    }
    {
        System.out.println("First Instance Init");
    }
    {
        System.out.println("Second Inistance Init");
    }
    static {
        System.out.println("Second Static Init");
    }

}
