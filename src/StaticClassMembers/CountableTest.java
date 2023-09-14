package StaticClassMembers;

public class CountableTest {
    public static void main(String[] args) {
        int objectCount;
        Countable o1 = new Countable();
        o1.InstanceCount = 2;
        Countable o2 = new Countable();
        Countable o3 = new Countable();
        Countable o4 = new Countable();
        Countable o5 = new Countable();
        Countable o6 = new Countable();


        /*objectCount = o1.getInstanceCount();

        System.out.println(objectCount);*/
        System.out.println(Countable.InstanceCount);

    }
}
