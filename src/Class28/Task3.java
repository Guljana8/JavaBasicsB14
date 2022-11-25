package Class28;
/*Create a map of Best Buy store.
Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc. )
Retrieve all keys and values from a Best Buy map using EntrySet.*/

import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        HashMap<Integer,String> bestBuyItems=new HashMap<>();
        bestBuyItems.put(7664847, "Printer");
        bestBuyItems.put(7879885, "TV");
        bestBuyItems.put(7754849, "Computer");
        bestBuyItems.put(7894850, "Phone");
        bestBuyItems.put(7454851, "Tablet");
        bestBuyItems.put(7324852, "Watch");

            System.out.println(bestBuyItems.entrySet());

    }
}
