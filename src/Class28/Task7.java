package Class28;
/*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers*/

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(10);

        int sum=0;
        for( Integer number: numbers){
            sum=sum+number;
        }
        System.out.println(sum);

    }
}
