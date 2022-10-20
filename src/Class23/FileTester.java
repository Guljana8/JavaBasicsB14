package Class23;

public class FileTester {
    public static void main(String[] args) {
        File [] file={new JavaFile(), new PdfFile(), new WordFile()};
        for(File a:file){
            a.open();
            a.edit();
            a.close();
        }
    }
}
