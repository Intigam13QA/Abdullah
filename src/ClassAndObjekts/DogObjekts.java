package ClassAndObjekts;

public class DogObjekts {
    public static void main(String[] args) {

        DogsClass dog1 = new DogsClass();
        DogsClass dog2 = new DogsClass();
        DogsClass dog3 = new DogsClass();

        dog1.age = 23;
        dog1.name = "Qasim";
        dog1.breed = "Doggi";
        System.out.println(dog1.age);
        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        dog1.barking();
        dog1.hungry();
        dog1.sleeping();


    }
}
