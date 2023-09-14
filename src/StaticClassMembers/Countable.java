package StaticClassMembers;

public class Countable {
 static int InstanceCount;
    public Countable(){
        InstanceCount++;
    }
    /*public int getInstanceCount (){
        return InstanceCount;
    }*/
}
