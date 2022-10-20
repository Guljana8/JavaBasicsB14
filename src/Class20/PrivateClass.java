package Class20;
//Create 1 class with a private method that has 3 overloaded forms.
// Then call each overloaded method with specific arguments and observe result.
public class PrivateClass {
    private PrivateClass obj;

    void printInfo(String monthName){
        System.out.println("Today is "+monthName);
    }
     void printInfo(int number1, int number2){
        System.out.println(number1+" "+number2);
    }

     void printInfo(String seasonName, String word) {
        System.out.println("It's "+seasonName+". One of my favorite "+word+".");
    }

    public static void main(String[] args) {
        PrivateClass obj=new PrivateClass();
        obj.printInfo("October");
        obj.printInfo(12, 2022);
        obj.printInfo("Autumn","season");


    }
}

