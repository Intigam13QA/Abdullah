package ClassObj2;

public class BankAccound {
    double balance;
    String accountholder;
    int accountnumber;

    public void deposit(double amount){
        System.out.println("Depositing $ "+amount+" to + "+ accountnumber);
        balance+=amount;
    }
    public void withdrow( double amount){
        System.out.println("Withdrowing $ "+ amount+ " from "+accountnumber);
        balance-=amount;
        if (balance<0){
            balance-=35;
        }

    }
    public void showBalance(){
        System.out.println("accountholder " + accountholder);
        System.out.println("accountnumber" + accountnumber);
        System.out.println("account Balance $ "+ balance);
        System.out.println("---------------------");

    }
    public void charg(double price,String item){
        if (balance>price){
            System.out.println("Buying "+item +" to $ " +price+ " from "+accountnumber);
            balance-=price;
        }else {
            System.out.println("Insufficient funds to purchase "+item+ " to $ " +price + " from " +accountnumber);
        }
    }
}

