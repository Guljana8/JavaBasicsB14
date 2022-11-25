package Class25;

import java.util.ArrayList;

/*Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Juice");
        drinks.add("Water");
        drinks.add("Cola");
        drinks.add("Sprite");
        drinks.add("Fanta");
        drinks.add("Mineral Water");

        var iterator =drinks.iterator();
        while(iterator.hasNext()){
            String beverage= iterator.next();
            if(beverage.contains("a") || beverage.contains("e")){
                System.out.println("water");
            }
        }
    }
}
