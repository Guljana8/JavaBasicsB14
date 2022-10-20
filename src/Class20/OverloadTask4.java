package Class20;
//Create 1 class with a static method that has 3 overloaded forms.
// Then call each overloaded method with specific arguments and observe result.
public class OverloadTask4 {
    static OverloadTask4 obj;

         void printInfo(String name){
            System.out.println("Today's class topic is "+name);
        }
        static void printInfo(int number1, int number2){
            System.out.println("Today is October "+number1+" "+number2);
        }

    static void printInfo(char character) {
        System.out.println("Java starts from letter "+character+".");
    }

    public static void main(String[] args) {
        OverloadTask4 obj=new OverloadTask4();
        obj.printInfo("Java");
        obj.printInfo(12, 2022);
        obj.printInfo('J');


    }
}
