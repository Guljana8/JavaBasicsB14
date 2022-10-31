package Class24;

public class Horse {
   private String name;
   private String breed;
   private String color;
   private int age;
   private double weight;

    public Horse(String name, String breed, String color, int age, double weight) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
        setWeight(weight);
    }
void printInfo(){
    System.out.println();
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public String getBreed() {
            return breed;
        }

    public void setBreed(String breed) {
        if(breed.isEmpty()){
            System.out.println("Breed cannot be empty");
        } else {
            this.breed = breed;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()){
            System.out.println("Color cannot be empty");
        }else {
            this.color = color;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 30) {
            System.out.println("Please use less age something seems wrong here are you sure its a dog?");
        } else if (age < 0) {
            System.out.println("age can't be negative");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
class Tester{
    Horse horse=new Horse("Arrow", "Akhal-Teke", "white", 10, 25.00);

}
