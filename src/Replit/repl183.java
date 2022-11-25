package Replit;

import java.util.ArrayList;


class Main183 {
    public static void main(String[] args) {
        ArrayList<String> objects=new ArrayList<>();
        objects.isEmpty();
        System.out.println(true);

        objects.add("Syntax");
        if(!objects.isEmpty()){
            System.out.println(false);
        }
    }
}
