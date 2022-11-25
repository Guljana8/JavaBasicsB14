package Class26;
 /*Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
 Create 3 subclasses Car, Pet, Health. Car class has its own attribute as carModel and Class Pet has petType attribute.
 Create 3 objects of the subclasses and store them in ArrayList.
 Using for loop/advanced for loop/ iterator access all methods of the class. */

import java.util.ArrayList;

public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }
    @Override
    void getQuote() {
        System.out.println(insuranceName+" quotation for "+carModel);
    }
    @Override
    void cancelInsurance() {
        System.out.println("Cancel "+insuranceName+" for "+carModel);
    }
}
class Pet extends Insurance{
    String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }
    @Override
    void getQuote() {
        System.out.println(insuranceName+" quotation for "+petType);
    }
    @Override
    void cancelInsurance() {
        System.out.println("Cancel "+insuranceName+" for "+petType);
    }
}
class Health extends Insurance{
    Health(String insuranceName) {
        super(insuranceName);
    }
    @Override
    void getQuote() {
        System.out.println(insuranceName+" quotation");
    }
    @Override
    void cancelInsurance() {
        System.out.println("Cancel my health "+insuranceName);
    }
}
class Tester{
    public static void main(String[] args) {
        Car carInsurance=new Car("Car Insurance", "Mini cooper");
        Pet petInsurance=new Pet("Pet insurance", "cat");
        Health healthInsurance=new Health("Health Insurance");
        ArrayList<Insurance> insurance=new ArrayList<>();
        insurance.add(carInsurance);
        insurance.add(petInsurance);
        insurance.add(healthInsurance);
        for( Insurance allInsurances :insurance){
            allInsurances.getQuote();
            allInsurances.cancelInsurance();
            System.out.println("-----------------");
        }
    }
}
