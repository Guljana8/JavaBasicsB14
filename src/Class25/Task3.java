package Class25;

import java.util.ArrayList;

/*Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.*/
public class Task3 {
    public static void main(String[] args) {

        ArrayList<Integer> evenNumbers = new ArrayList<>(250);

        for (int i = 2; i <= 500; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        evenNumbers.removeIf(number -> number % 5 == 0);
        System.out.println(evenNumbers);
    }
}


