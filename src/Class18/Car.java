package Class18;
public class Car{
    String model;
    String make;
    String color;
    int year;
    int topSpeed;
    double price;


}
class BMW extends Car{
    double engineCC;
    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" color "+color);
    }

}
class Tesla extends Car{

}
class Toyota extends Car{
    double engineCC;
}
class CarTester {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.make ="x5M";
        bmw.color="Black";
        bmw.model="x8";
        bmw.printCarDetails();
    }
}