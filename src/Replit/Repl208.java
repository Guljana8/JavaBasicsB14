package Replit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repl208 {
    public static void display(Map<String, Integer> map){
        if (!map.isEmpty()){
            Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
            for (var entry: map.entrySet()){
                String key=entry.getKey();
                int value= entry.getValue();
                System.out.println(key + " : " + value);
            }}else{
            System.out.println("Map is empty");
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        display(map);
        map.clear();
        display(map);
    }
}

