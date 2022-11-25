package Class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99); //helps to store the values in a map
        fruit.put("Mango", 2.99); //values can be duplicate and we do not use Set
        fruit.put("Orange", 4.99); //keySet will return the keys as it is unique.
        fruit.put("Banana", 10.1);

        var allKeys=fruit.keySet();//getting all the keys in the form of the set
       // Set<String> allKey=fruit.keySet(); => another way of var
        System.out.println(allKeys);

        Iterator<String> iterator=allKeys.iterator();//Getting on iterator on that set
        while (iterator.hasNext()){
            String item= iterator.next();
            if(item.contains("n")){
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}
