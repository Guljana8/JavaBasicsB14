package Class22;

public class Animal {
    void eat(){
        System.out.println("Animals usually eat plants");
    }
    void sleep(){
        System.out.println("Animals sleep for 8 to 18 hours");
    }
}
class Panda extends Animal{
    void eat() {
        System.out.println("Pandas eat Bamboos");
    }

    //@Override - is  an annotation that tells Java to check for extra rules like if we are properly overriding a method or not
    void sleep() {
        System.out.println("Pandas sleep for 14 hours");
    }
}
class Cat extends Animal{
    void eat() {
        System.out.println("Cats like to eat Fish");
    }
}