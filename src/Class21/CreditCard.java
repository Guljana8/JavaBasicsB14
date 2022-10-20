package Class21;
/*Create a class CreditCard and define variable balance and interest.
*Create an instance method that will calculate interest based on the given balance.
*Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
*Call the method by creating an object of each of the three classes*/

public class CreditCard {
    double balance;
    double interest;
    CreditCard(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
    }
    void calculateInterest(){
        System.out.println((interest/12)*balance);
    }
}
class Visa extends CreditCard{
    Visa(double balance, double interest){
        super(balance, interest);
    }
    @Override
    void calculateInterest() {
        super.calculateInterest();
    }
}
class AX extends CreditCard{
    AX(double balance, double interest){
        super(balance, interest);
        super.calculateInterest();
    }

    public static void main(String[] args) {
        CreditCard card1=new CreditCard(2000,0.5);
        card1.calculateInterest();
        Visa card2=new Visa(5000,0.25);
        card2.calculateInterest();
        AX card3=new AX(15000,0.25);
        card3.calculateInterest();
    }
}