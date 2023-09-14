package Interface;

public class ElectricCarTest {
    public static void main(String[] args) {

       Tesla modelS = new Tesla("ModelS",34.00,"Red");
       modelS.charge();
       modelS.drive();
       modelS.start();
       modelS.stop();
        System.out.println();
       Ford fusion = new Ford("Fusion",45.00,"Yellow",2022);
       fusion.charge();
       fusion.drive();
       fusion.start();
       fusion.stop();
        System.out.println();
       TeslaSemi ts = new TeslaSemi("Semi", 56.00,"Brown",4.5);
       ts.charge();
       ts.drive();
       ts.start();
       ts.load("Big Boy");
       ts.stop();
        System.out.println();
       TeslaTrack teslaTrack = new TeslaTrack("Track",56.00,"Black",5.6);
       teslaTrack.charge();
       teslaTrack.drive();
       teslaTrack.load("AQ");
       teslaTrack.start();
       teslaTrack.stop();
        System.out.println();
        System.out.println(modelS.toString());
        System.out.println(fusion.toString());
        System.out.println(ts.toString());
        System.out.println(teslaTrack.toString());
    }
}
