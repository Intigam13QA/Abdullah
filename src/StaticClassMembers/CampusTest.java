package StaticClassMembers;

public class CampusTest {
    public static void main(String[] args) {
        Campus c1 = new Campus("Baku");
        Campus c2 = new Campus("o");
        System.out.println(Campus.country);
        Campus.country="Baku";

        System.out.println(Campus.country);
        c1.village="AK";
        System.out.println(c2.village);
        System.out.println(c1.village);
        System.out.println(c2.getCountry());
        System.out.println(c1.getCity());
        System.out.println(c2.getVillage());
    }


}
