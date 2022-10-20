package Class22;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        System.out.println("------Toyota-------");
        Toyota toyota=new Toyota();
        toyota.start();
        toyota.stop();
        System.out.println("------Tesla-------");
        Tesla tesla=new Tesla();
        tesla.stop();
    }
}
