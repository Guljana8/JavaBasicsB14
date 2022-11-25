package Class26;

import java.util.TreeSet;

public class Countries {
    /*Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
    Using 2 different ways retrieve all elements from set. */
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Turkiye");
        treeSet.add("USA");
        treeSet.add("Belgium");
        treeSet.add("France");
        treeSet.add("Albania");
        treeSet.add("Germany");
        System.out.println(treeSet);
    }
}
