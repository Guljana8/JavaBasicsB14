package Class27;

import java.util.ArrayList;

public abstract class Insurance {
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    abstract void getQuot();
    abstract void cancelInsurance();
}
class Car extends Insurance{
 String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }


    @Override
    void getQuot() {
        System.out.println(insuranceName+ " charges %3 for "+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuot() {
        System.out.println(insuranceName+" charges $1500 for "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled for "+petType);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuot() {
        System.out.println(insuranceName+" charges $2000 for health.");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class Tester{
    public static void main(String[] args) {
        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("Adam","Tesla Model S"));
        insurances.add(new Pet("Geico", "Dog"));
        insurances.add(new Health("Star Alliance"));
        System.out.println(insurances);

        for(Insurance i : insurances){
            i.getQuot();
            i.cancelInsurance();
        }
    }
}