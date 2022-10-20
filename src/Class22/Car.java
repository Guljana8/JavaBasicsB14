package Class22;

public class Car {
    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("Use breaks to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
    void start() {
        System.out.println("Use Push start to start me");
    }

    void stop(){
        super.park();
        System.out.println("you can use auto-breaking to stop me");
    }
}class Toyota extends Car{
    void start() {
        System.out.println("Push me to start");
    }
}
class Tesla extends Car{
    void start(){
        System.out.println("Use the App to start me");
    }
    void stop(){
        System.out.println("Use AI and AutoBreaking to stop me");
    }

    void park(){
        System.out.println("I can auto park myself");
    }
}