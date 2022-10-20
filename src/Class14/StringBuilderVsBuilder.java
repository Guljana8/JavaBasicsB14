package Class14;

public class StringBuilderVsBuilder {
    public static void main(String[] args) {
        // Mostly used class newer better faster
        StringBuilder stringBuilder=new StringBuilder("It's a wonderful day!");

        // Older one show and not used mostly
        StringBuffer stringBuffer=new StringBuffer("Today is Java class");

        String str="Java is very easy!";
        StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1 = "+stringBuilder1);

        String newStr=stringBuilder1.toString();

    }


    }