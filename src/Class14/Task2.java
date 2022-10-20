package Class14;

public class Task2 {
    public static void main(String[] args) {
// Create a String that should be combination of letters, numbers and special characters.
// Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String str="hgsAWRTT122344#$*79djmdAA";
        str=str.replaceAll( "[^a-zA-Z]"," " );
        System.out.println("str = " + str);
        System.out.println(str.length());
    }
}
