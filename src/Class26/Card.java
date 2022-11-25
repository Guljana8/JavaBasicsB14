package Class26;

import Class21.CreditCard;

import java.util.LinkedList;

/*Create a Card class that will have implemented and unimplemented methods and a constructor
that will initialize credit card type.
Create 3 subclasses of a Card card.
Create 3 objects of different card and store them into LinkedList.
Using for loop/advanced for loop/ iterator access all methods of the class.*/
public abstract class Card {
    String creditCard;
    Card(String creditCard){
        this.creditCard=creditCard;
    }
    void implementedMethod() {
        System.out.println("This is implemented method for "+creditCard);
    }
    abstract void unimplementedMethod();
}
class BankCard extends Card{
    BankCard(String creditCard) {
        super(creditCard);
    }
    @Override
    void implementedMethod() {
        super.implementedMethod();
    }
    @Override
    void unimplementedMethod() {
        System.out.println("This is unimplemented method for "+creditCard);
    }
}
class DebitCard extends Card{
    DebitCard(String creditCard) {
        super(creditCard);
    }
    @Override
    void implementedMethod() {
        super.implementedMethod();
    }
    @Override
    void unimplementedMethod() {
        System.out.println("This is unimplemented method for "+creditCard);}
}
class VisaCard extends Card{
    VisaCard(String creditCard) {
        super(creditCard);
    }
    @Override
    void implementedMethod() {
        super.implementedMethod();
    }
    @Override
    void unimplementedMethod() {
        System.out.println("This is unimplemented method for "+creditCard);}
}
class CardTester{
    public static void main(String[] args) {
        BankCard bankCard=new BankCard("Bank card");
        DebitCard debitCard=new DebitCard("Debit card");
        VisaCard visaCard=new VisaCard("Visa card");
        LinkedList<Card> cardTypes=new LinkedList<>();
        cardTypes.add(bankCard);
        cardTypes.add(debitCard);
        cardTypes.add(visaCard);

        var iterator =cardTypes.iterator();
        while (iterator.hasNext()){
           Card cards=iterator.next();
           cards.implementedMethod();
           cards.unimplementedMethod();
        }
    }
}