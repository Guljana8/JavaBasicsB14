package Replit;

import java.util.HashMap;

public class Repl207 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        System.out.println("HashMap Before Replace :");
        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            var letters = iterator.next();
            System.out.println(letters.getKey() + " : " + letters.getValue());
        }
        System.out.println("------------------");
        System.out.println("HashMap After Replace :");
        /*var iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            var word = iterator2.next();
            var key = iterator2.next();
            var value = iterator2.next();

            if(word.getKey().equalsIgnoreCase("CCC")){
                System.out.println("Sumair");}}*/
          String str=map.replace("FIVE", "SUMAIR");
          String str2=map.replace("THREE", "ASEL");
        var iterator2 = map.entrySet().iterator();
        while(iterator2.hasNext()){
            var word=iterator2.next();
            System.out.println(word.getKey()+" : "+word.getValue());
        }
    }
}
