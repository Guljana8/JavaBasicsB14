package Class26;

import java.util.ArrayList;
import java.util.HashSet;

public class WhySet {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);

        HashSet<Integer> setNumbers=new HashSet<>();
        setNumbers.add(10);
        setNumbers.add(20);
        setNumbers.add(10);
        System.out.println(setNumbers);
    }
}
