package Replit;

import java.util.LinkedHashSet;

public class Repl199 {
    public static void main(String[] args){
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("null");
        linkedHashSet.add("Sohil");
        linkedHashSet.add("Diego");
        linkedHashSet.add("Alijon");
        linkedHashSet.add("Asel");
        linkedHashSet.add("Sumair");

        for( String value: linkedHashSet){
            System.out.println(value);
        }
        var iterator=linkedHashSet.iterator();

        while(iterator.hasNext()){
            var word=iterator.next();
            System.out.println(word);
        }
    }
}
