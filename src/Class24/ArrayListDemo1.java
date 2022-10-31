package Class24;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //syntax to create an ArrayList
        ArrayList<String> colors=new ArrayList<>();
        //use add() method
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        //prints all elements
        System.out.println(colors);
        //get() method prints individual elements from arrayList
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));
        //size() method prints
        System.out.println(colors.size());

        System.out.println("------------------------------");
        for(int i=0; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }
        System.out.println("------------------------------");
        for(String color : colors){
            System.out.println(color);
        }
    }
}
