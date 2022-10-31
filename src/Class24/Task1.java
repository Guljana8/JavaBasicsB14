package Class24;

import java.util.ArrayList;

/*Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that*/
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(5);
        names.add("Alice");
        names.add("Melisa");
        names.add("Sarah");
        names.add("Sofia");
        names.add("Lamia");

        System.out.println("This list is empty: "+names.isEmpty());
        System.out.println("This list contains name Sarah :"+names.contains("Sarah"));
        System.out.println("The size of this list: "+names.size());
        System.out.println(names);

    }
}
