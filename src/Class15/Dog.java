package Class15;

public class Dog {
    String name; //instance

    static int noOfLegs=4;
    String color;

    void bark(){
        int i=0; //local
        for( int j=0; j< i; j++){
            // int j is also a local variable
            System.out.println("Barking");
        }
    }
    void prinInfo(){
        System.out.println("name "+name+" color "+color);
    }
    void printName(){
        System.out.println("name "+name);
    }

    public static void main(String[] args){
        Dog dog=new Dog();
        dog.bark();
    }
}
