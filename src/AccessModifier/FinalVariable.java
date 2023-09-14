package AccessModifier;

public class FinalVariable {
    public final  int rosterMaxeRang = 600; //same statement
    public final int Model_Max_Speet;
    public final int Model_X_Passenger;
    public static final String userName;

    static {
        userName = "Abdullah"; // static

    }

   {
        Model_X_Passenger = 7; //int block
    }
    public FinalVariable(){
        Model_Max_Speet  =5; // constructor
    }




    public static void main(String[] args) {
        final int Max_Passenger_Count = 5;
        final int SSN;
        SSN =5;
        FinalVariable fv = new FinalVariable();
        System.out.println(fv.rosterMaxeRang);
        System.out.println(fv.Model_Max_Speet);
        System.out.println(fv.Model_X_Passenger);
        System.out.println(userName);
        System.out.println(SSN);
    }
}
