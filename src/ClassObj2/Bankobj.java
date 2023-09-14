package ClassObj2;

public class Bankobj {
    public static void main(String[] args) {
        BankAccound bank1 = new BankAccound();
        bank1.accountholder="Abdullah";
        bank1.accountnumber=678594;
        bank1.deposit(250);
        bank1.showBalance();
        bank1.withdrow(100);
        bank1.showBalance();
        bank1.charg(150, "Table");
        bank1.showBalance();
    }
}
