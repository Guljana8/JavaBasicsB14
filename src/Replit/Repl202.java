package Replit;

import java.util.TreeMap;

public class Repl202 {
    public static void main(String[] args) {
        TreeMap<String, String> items=new TreeMap<>();
        items.put("1 item", "apple");
        items.put("2 item", "banana");
        items.put("3 item", "pear");
        items.put("4 item", "tomato");
        items.put("5 item", "mango");
        items.put("6 item", "kiwi");

        var entrySet = items.entrySet();
        for(var item : entrySet){
            System.out.println("Key is "+item.getKey()+" and values is "+item.getValue());
        }
    }
}
