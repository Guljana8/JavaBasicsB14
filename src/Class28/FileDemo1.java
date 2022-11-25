package Class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        /* RightClick on your file and click copy path reference then click from Content root*/
        var path="Data/config.properties"; //location of the file
       // FileInputStream fileInputStream=new FileInputStream(path); //it helps us navigate to the file
        var fileInputStream=new FileInputStream(path);
        var properties=new Properties();
        properties.load(fileInputStream); //loads all the data from the file inside(Memory)
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close(); //close the file
    }
}
