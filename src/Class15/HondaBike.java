package Class15;

public class HondaBike {
    static int topSpeed=200;
    static int noOfTyres=2;
    String model;
    int year;

 void printTotalDistance(int noOfGallons, int avg ){
        double distance=noOfGallons/10;
        System.out.println("Your bike can go max "+distance+" with this much "+noOfGallons);
    }
    public static void main(String[] args){
        System.out.println(HondaBike.noOfTyres);
        HondaBike yrb=new HondaBike();
        yrb.model="yrb100";
       // yrb.printTotalDistance( 10);
    }
}
