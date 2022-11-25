package Replit;

import java.util.ArrayList;

public class repl187 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");

        words.removeIf(x -> x.contains("hi"));

        System.out.println();

    }
}
