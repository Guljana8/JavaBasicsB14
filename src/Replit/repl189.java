package Replit;

import java.util.LinkedList;

public class repl189 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        for(int i=50; i<=100; i++){
            numbers.add(i);
        }
        numbers.removeIf(num -> num % 3==0);
            System.out.print(numbers);

    }
}
