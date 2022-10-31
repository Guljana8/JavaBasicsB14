package Class24;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionsFramework {
    public static void main(String[] args) {
        String name = "Guljan";


    String[] breeds = new String[10];
    breeds[0]="Husky";
        System.out.println(Arrays.toString(breeds));

    ArrayList<String> colors = new ArrayList<>();
    colors.add("Green");
    colors.add("Red");
        System.out.println(colors);
}
}
