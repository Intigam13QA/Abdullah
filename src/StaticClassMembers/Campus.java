package StaticClassMembers;

import java.util.SplittableRandom;

public class Campus {

    private String city;
    static String country;
    String village;



    static {
        System.out.println("Static Blok-1");
        country = "USA";

    }

    public Campus(String city) {
        System.out.println("Hi");
        this.city = city;
        village = "IB";

    }
    static {
        System.out.println("Static Block-2");
        country = "UK";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static String getCountry() {
        return country;

    }

    public static void setCountry(String country) {
        Campus.country = country;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }
}
