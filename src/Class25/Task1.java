package Class25;

import java.util.ArrayList;
import java.util.Iterator;

/*Create an arrayList of words. Remove every word that ends with “e”*/
public class Task1 {
    public static void main(String[] args) {

    ArrayList<String> word=new ArrayList<>(6);
    word.add("Halloween");
    word.add("Spooky");
    word.add("Candy");
    word.add("Zombie");
    word.add("Haunted House");
    word.add("Witch");

        word.removeIf(x -> x.endsWith("e"));
        System.out.println(word);

    }
}

