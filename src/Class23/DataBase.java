package Class23;

public abstract class DataBase {
    abstract void openDatabase();
    abstract void readData();
    abstract void writeData();
    abstract void closeDatabase();
}
class MicrosoftDataBase extends DataBase{

    @Override
    void openDatabase() {
        System.out.println("Opening the Microsoft Database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from MSDataBase");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data MSDateBase");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the browsr");
    }
}
class Oracle extends DataBase{
    @Override
    void openDatabase() {
        System.out.println("Opening the Oracle database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from Oracle databse");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data to Oracle database");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the Oracle database");
    }
}