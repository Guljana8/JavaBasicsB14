package Class28;
/*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        TreeMap<String, String> map=new TreeMap<>();
        map.put("United Kingdom", "London");
        map.put("Italy", "Rome");
        map.put("Spain", "Barcelona");
        map.put("France", "Paris");
        map.put("Netherlands", "Amsterdam");
        map.put("Sweden", "Stockholm");

        System.out.println("All keys and values with a for each loop:");
        for(var countries : map.entrySet()){
            System.out.println(countries);
        }
        System.out.println("-----------------------------------");
        System.out.println("All keys and values with a iterator:");
        var iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            var country=iterator.next();
            var capital=iterator.next();

            System.out.println(country+" "+capital);
        }
        System.out.println("-----------------------------------");
        System.out.println("All values with a for each loop:");
        for (String capital : map.values()){
            System.out.print(capital+" ");
        }
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("All values with a iterator:");
        var iteratorVal=map.values().iterator();
        while (iteratorVal.hasNext()){
            var values=iteratorVal.next();
            System.out.println(values);
        }

    }
}
