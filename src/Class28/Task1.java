package Class28;
/*Create a map of a building.
Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map*/

import java.util.LinkedHashMap;

public class  Task1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> building=new LinkedHashMap<>();
        building.put(1, "Google");
        building.put(2, "Google");
        building.put(3, "Facebook");
        building.put(4, "Facebook");
        building.put(5, "Twitter");
        building.put(6, "Instagram");
        building.put(7, "Linkedin");

        System.out.println("Number of entries : " +building.size());
        building.replace(4, "Syntax");
        building.remove(7,"Linkedin");
        System.out.println(building);

    }
}
