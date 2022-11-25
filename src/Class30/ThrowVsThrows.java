package Class30;

import Class29.ExcelReader;

import java.io.IOException;

public class ThrowVsThrows {
    public static void main(String[] args)  {
        method();
    }
       public static void method() {
           try {
               System.out.println(ExcelReader.read("Data/Test.xlsx"));
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
    }
}
