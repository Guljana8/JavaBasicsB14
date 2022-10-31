package Replit;

public interface MyInterface {
        public void method1();
        public void method2();

    }
class Main implements MyInterface{
    public static void main(String[] args) {
        Main obj=new Main();
        obj.method1();
        obj.method2();
    }

    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }
}
