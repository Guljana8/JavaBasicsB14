package Class28;
/*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/

import java.util.LinkedHashSet;

public class Task6 {
    public static void main(String[] args) {
        LinkedHashSet<String> words=new LinkedHashSet<>();
        words.add("Keep");
        words.add("calm");
        words.add("and");
        words.add("enjoy");
        words.add("Autumn!");

        for(String word : words){
            System.out.print(word+" ");
        }
    }
}
