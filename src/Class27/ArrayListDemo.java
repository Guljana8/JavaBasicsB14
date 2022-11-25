package Class27;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Tommy","black","German"));
        dogs.add(new Dog("Jonny", "white","Husky"));
        dogs.add(new Dog("Kimi","brown","Golden"));

        System.out.println(dogs);
    }
}
