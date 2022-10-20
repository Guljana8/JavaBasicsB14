package Class18;

public class Book {
    /*Write Book class that will have instance variables and 2 Constructors.
    *While creating an object make sure:
    * Instance variables are being initialized Both Constructors are being executed
     */
    String bookName;
    String writer;
    int NumOfPages;
    int publishedYear;

    public Book(String bookName,String writer, int publishedYear){
        this.bookName=bookName;
        this.writer=writer;
        this.publishedYear=publishedYear;


    }
   public Book(String bookName, String writer,int NumOfPages, int publishedYear){
        this(bookName, writer,publishedYear);
        this.NumOfPages=NumOfPages;

    }


    void printInfo(){
        System.out.println("Book: "+bookName+" Writer: "+writer+". Was published at "+publishedYear);
    }

    public static void main(String[] args) {
        Book obj=new Book("Anna Karenina","Leo Tolstoy", 2019,896);
        Book obj1=new Book("Gone with the Wind","Margaret Mitchell", 1936 );
        obj.printInfo();
        obj1.printInfo();

    }
}

