package Replit;

import java.util.ArrayList;
import java.util.Scanner;

public class repl188 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num = inp.nextInt();
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(num);
        numbers.add(num);
        numbers.add(num);
        numbers.add(num);
        numbers.add(num);

        for( Integer number: numbers){
            System.out.print(number+" ");
        }
    }
}
