package Class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypeOfSets {
    public static void main(String[] args) {
    /* There are 3 types of Sets:
    1) HashSet:
    DownSide -> does not care about the insertion order
    UpSide -> It's fastest type of set
    */

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Mango");
        hashSet.add("Apple");
        hashSet.add("Kiwi");
        hashSet.add("Orange");
        hashSet.add("Banana");
        System.out.println("HashSet");
        System.out.println(hashSet);

        /*insertion speed is same as HashSet but retrieval is the worst*/
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        System.out.println("LinkedHashSet");
        System.out.println(linkedHashSet);

        /*When ever you need sorted data use TreeSet*/
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Kiwi");
        treeSet.add("Orange");
        treeSet.add("Banana");
        System.out.println("TreeSet");
        System.out.println(linkedHashSet);
    }
}
