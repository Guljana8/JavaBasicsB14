package Class18;

public class Horse extends Animal{

    public Horse(String name, String breed, int age, double weight){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }
    void printInfo(){
        System.out.println("name "+name+" breed "+breed+" age "+age+" weight "+weight);
    }

    public static void main(String[] args) {
        Horse horseObject=new Horse("Sprit", "stallion", 20, 400);
    }
}
