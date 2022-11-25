package Class28;

import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> items=new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Egg", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);

        Set<String> keys =items.keySet();
        for(String key: keys){
            System.out.println(key);
        }

    }
}
