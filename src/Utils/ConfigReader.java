package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//THIS METHOD WE NEED TO READ THE PROPERTIES
public class ConfigReader {
    public static Properties read (String path){ //we take a path
//we path this path to the fileInputStream
        var properties = new Properties();
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream(path);
//Then we get the proprieties

//We load all the information
            properties.load(fileInputStream);
        }
        catch(FileNotFoundException exception){
          //  System.out.println("Please check your file path"); => use this approach for normal users with no technical background
            exception.printStackTrace(); //=> use this code for programmers
        }
        catch (IOException exception){
            System.out.println("Please check your hardDrive");
        }
        finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//We return properties
        return properties;
    }
}
