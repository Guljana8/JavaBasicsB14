package Replit;

import java.util.HashSet;

public class Repl197 {
    public static void main(String[] args){
        HashSet<String> colors=new HashSet<>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Black");
        System.out.println("Original Hash Set: "+colors);

        for(int i=0; i < colors.size(); i++){
            if(colors.size()==5) { //   if(animals.get(i).length()>4)
                System.out.println("Size of the Hash Set: " + colors.size());
                break;
            }
        }
    }
}
