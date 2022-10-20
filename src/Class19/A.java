package Class19;

public class A {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.

    static String className;
    static char letter;

   static void printF() {
        System.out.println("This is class: "+className+" and it inherits from class " + letter);
    }
    A(String className, char letter) {
        this.className = className;
        this.letter=letter;
    }
}
class B extends A {
    B(String className, char letter) {
        super(className,letter);
    }
}
class C extends B{
            C(String className, char letter){
                super(className,letter);
            }
}
class userTest{
    public static void main(String[] args) {
        B classB= new B("B",'A');
        classB.printF();
        C classC = new C("C", 'B');
        classC.printF();
    }
}


