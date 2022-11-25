package Class26;

import java.util.LinkedList;

public class ListOfCities {
    /*Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        LinkedList<String> cityList=new LinkedList<>();
        cityList.add("Istanbul");
        cityList.add("New York");
        cityList.add("Paris");
        cityList.add("Brussels");
        cityList.add("Amsterdam");
        cityList.add("Barcelona");
        cityList.add("Athens");
        System.out.println(cityList);
    }
}
