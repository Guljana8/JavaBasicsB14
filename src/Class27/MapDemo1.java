package Class27;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit=new HashMap<>();

        fruit.put("Apple", 1.99); //helps to store the values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana",10.1);
        System.out.println(fruit);
        System.out.println(fruit.get("Orange"));
        fruit.remove("Mango");
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Apple"));//tells us if a key is present inside th emap or not
        System.out.println(fruit.containsKey("Kiwi"));
        System.out.println(fruit.containsValue(4.99));//searches the map for this value

        fruit.replace("Apple", 2.99);
        System.out.println(fruit);
    }
}
