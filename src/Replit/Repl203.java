package Replit;

import java.util.HashMap;

public class Repl203 {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);

        var iterator=map.entrySet().iterator();
        while(iterator.hasNext()) {
            var input = iterator.next();
            System.out.println(input);
        }
    }
}
