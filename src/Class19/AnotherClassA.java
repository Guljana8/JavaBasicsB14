package Class19;

public class AnotherClassA {
    //*Write program to inherit class A that has method printF which is static and call
    // or reuse that method into class B

    static void printF(){
        System.out.println("This program is for class A");
    }
}
class AnotherClassB extends AnotherClassA{
    public static void main(String[] args) {
        AnotherClassB.printF();
    }
    }

