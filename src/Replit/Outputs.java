package Replit;

public interface Outputs {
    void display(double result);
}

interface Functions extends Outputs{
    @Override
    default void display(double result) {
        System.out.println("Result is ::: "+result);

    }
    double adding(double firstNumber, double SecondNumber);
    double subtracting(double firstNumber, double SecondNumber);
    double multiply(double firstNumber, double SecondNumber);
    double dividing(double firstNumber, double SecondNumber);
}
class Main1 implements Functions{
    double result;
    public double adding(double firstNumber, double SecondNumber){
        result=firstNumber+SecondNumber;
        display(result);
        return result;
    }
    public double subtracting(double firstNumber, double SecondNumber){
        result=firstNumber-SecondNumber;
        display(result);
        return result;
    }
    public double multiply(double firstNumber, double SecondNumber){
        result=firstNumber*SecondNumber;
        display(result);
        return result;
    }
    public double dividing(double firstNumber, double SecondNumber){
       result=firstNumber/SecondNumber;
        display(result);
        return result;
    }
    public static void main(String[] args) {
        Main1 obj=new Main1();
        obj.adding(100.00, 20.00);
        obj.subtracting(100.00, 20.00);
        obj.multiply(100.00, 20.00);
        obj.dividing(100.00, 20.00);
    }
}
