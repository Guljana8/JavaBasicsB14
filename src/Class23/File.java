package Class23;
/*Create a class File that will have the following behaviors: open, edit, close.
*Edit and close are implemented method while open is an abstract.
* Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
* Example: to open .java file we need notepad++ or sublime text, to open .doc file we need MicrosoftWord to be installed etc
 */
public abstract class File {
    abstract void open();
    void edit(){
        System.out.println("Edit the file.");
    }
    void close(){
        System.out.println("Close the file.");
    }
}
class JavaFile extends File{
    @Override
    void open() {
        System.out.println("To open .java file we need notepad++  or sublime text");
    }
}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("to open .doc file we need MicrosoftWord to be installed");
    }
}
class PdfFile extends File{
    @Override
    void open() {
        System.out.println("Open a PDF file we need a Adobe Acrobat Reader");
    }
}